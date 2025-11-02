/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.repositorio;

import static io.quarkus.hibernate.orm.panache.Panache.getEntityManager;

/**
 *
 * @author jayron
 */
public class postulante_rol {



      
    public postulante_rol findRol(Long id_usuario){
    
    return getEntityManager()
                .createQuery("SELECT c FROM usuario_rol c WHERE c.usuario_id = :idUsuario", postulante_rol.class)
                .setParameter("idUsuario", id_usuario)
                 .getSingleResult();
  
    }
    
    
}
