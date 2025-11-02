/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyecto.servicio;


import com.umg.proyecto.modelo.cliente;
import com.umg.proyecto.modelo.postulante;
import com.umg.proyecto.modelo.usuario_rol;
import com.umg.proyecto.odt.usuario_odt;
import com.umg.proyecto.repositorio.cliente_repositorio;
import com.umg.proyecto.repositorio.usuario_repositorio;
import com.umg.proyecto.repositorio.usuario_rol_repositorio;
import com.umg.proyecto.usuario;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.ws.rs.core.Response;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Jovany
 */

@ApplicationScoped
public class usuario_servicio {
    
    
    @Inject
    usuario_repositorio ur;
    
    @Inject
    cliente_repositorio cr;
    
     @Inject
    postulante_repositorio a;
    
    @Inject
    usuario_rol_repositorio urr;
    
        public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

      
      
    public static boolean verificarPassword(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
    
    public Response login_servicio(usuario_odt user){
    
      try {
            // Validación básica de entrada
            if (user == null || user.user == null || user.pass == null) {
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity("Usuario o contraseña no proporcionados.")
                        .build();
            }

            // Buscar usuario en base de datos (por nombre de usuario)
            usuario usuario = ur.find("nombre_usuario", user.user).singleResult();

            // Verificar contraseña
            boolean passwordValido = verificarPassword(user.pass, usuario.password);
                
            if (!passwordValido) {
                
                
                return Response.status(Response.Status.UNAUTHORIZED)
                        .entity("Credenciales inválidas.")
                        .build();
            }
            
            
            usuario_rol usrol = urr.findRol(usuario.usuario_id);
            
            System.out.println(usrol.rol_id);
            if (usrol.rol_id ==3) {
              cliente cl = cr.findCliente(usuario.usuario_id);
              return Response.ok(cl)
                    .entity(cl) // Puedes sustituir esto por un DTO o token JWT
                    .build();
          }
           if (usrol.rol_id==2) {
              postulante cl = a.findpostulante(usuario.usuario_id);
              return Response.ok(cl)
                    .entity(cl) // Puedes sustituir esto por un DTO o token JWT
                    .build(); 
          }
            
             
              return Response.serverError().build();
                   

        } catch (NoResultException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("s no encontrado.")
                    .build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Error interno al procesar el inicio de sesión.")
                    .build();
        }
    }
    
}
