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
@Table(name="cliente")
public class cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cliente_id")
    public Long cliente_id;
    
    
    @Column(name = "usuario_id")
    public Long usuario_id;
    
    @Column(name = "empresa")
    public String empresa;
    
    @Column(name = "nombre_contacto")
    public String nombre_contacto;
    
    @Column(name = "correo")
    public String correo;
    
    @Column(name = "cod_postal")
    public int cod_postal;
    
    @Column(name = "nit")
    public Long nit;
    
    @Column(name ="puesto_contacto")
    public String puesto_contacto;
    @Column(name = "telefono")
    public Long telefono;
    @Column(name = "pasword")
    public String password;
}
