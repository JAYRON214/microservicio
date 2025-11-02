/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.repositorio;

import com.umg.proyecto.modelo.cliente;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author Jovany
 */

@ApplicationScoped
public class cliente_repositorio implements PanacheRepository<cliente>{
    
    
    
    
    @Transactional
    public void crear(cliente cliente){
    
    this.persist(cliente);
    }
    
    public cliente findCliente(Long id_usuario){
    return getEntityManager()
                .createQuery("SELECT c FROM cliente c WHERE c.usuario_id = :idUsuario", cliente.class)
                .setParameter("idUsuario", id_usuario)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }
}
