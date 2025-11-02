/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jovany
 */

@Entity
@Table(name = "usuario")
public class usuario {
    public long rol_id;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    public Long usuario_id;
    
    @Column(name = "nombre_usuario")
    public String nombre_usuairo;
    
    @Column(name = "password_hash")
    public String password;
    
    @Column(name = "correo")
    public String correo;
    
    @Column(name = "status")
    public  boolean status;
}
