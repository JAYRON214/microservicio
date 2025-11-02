/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.modelo;

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
@Table(name="usuario_rol")
public class usuario_rol {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuario_rol_id")
    public Long usuario_rol_id;
    
    @Column(name = "usuario_id")
    public Long usuario_id;
    
    @Column(name = "rol_id")
    public Long rol_id;
}
