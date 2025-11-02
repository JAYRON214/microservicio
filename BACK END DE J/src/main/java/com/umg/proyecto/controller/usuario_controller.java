/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.controller;


import com.umg.proyecto.odt.usuario_odt;
import com.umg.proyecto.servicio.usuario_servicio;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jovany
 */

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class usuario_controller {
    
    @Inject
    usuario_servicio us;
    
    
    
    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
    public Response login(usuario_odt user){
    
    return us.login_servicio(user);
    }
    
}
