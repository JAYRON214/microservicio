/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.repositorio;

import com.umg.proyecto.modelo.cliente;
import com.umg.proyecto.modelo.usuario_rol;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Jovany
 */

@ApplicationScoped
public class usuario_rol_repositorio implements PanacheRepository<usuario_rol>{
   
    
    
    public usuario_rol findRol(Long id_usuario){
    
    return getEntityManager()
                .createQuery("SELECT c FROM usuario_rol c WHERE c.usuario_id = :idUsuario", usuario_rol.class)
                .setParameter("idUsuario", id_usuario)
                 .getSingleResult();
  
    }
}
