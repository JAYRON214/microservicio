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
@Table(name = "requisito")
public class Requisito implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "requisito_id")
    private Integer requisitoId;
    @Column(name = "expertencia_anos")
    private Integer expertenciaAnos;
    @Column(name = "edad")
    private Integer edad;
    @Column(name ="nivel_academico_id")
    private int nivelAcademicoId;
    
}
