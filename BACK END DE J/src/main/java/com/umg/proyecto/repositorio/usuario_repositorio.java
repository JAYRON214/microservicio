/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.repositorio;

import com.umg.proyecto.usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Jovany
 */

@ApplicationScoped
public class usuario_repositorio implements PanacheRepository<usuario>{
    
}
