/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "proceso")
public class Proceso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proceso_id")
    private Long procesoId;
    @Column(name = "fase_id")
    private int faseId;
    @Column(name = "postulante_id")
    private Long postulanteId;
    @Column(name = "vancate_id")
    private Long vacanteId;

    
    
}
