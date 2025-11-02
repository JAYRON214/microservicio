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
@Table(name ="rol")
public class rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int rol_id ;
    
    @Column(name = "nombre")
    public String nombre;
}
