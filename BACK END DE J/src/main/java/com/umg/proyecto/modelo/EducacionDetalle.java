/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EducacionDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    // Asocia este atributo con la columna "educacion_detalle_id" en la base de datos
    @Column(name = "educacion_detalle_id")
    // Campo que representa el ID del registro en la tabla (clave primaria)
    private Integer educacionDetalleId;

    @Column(name = "centro_educativo")
    private String centroEducativo;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "nivel_estudio")
    private String nivelEstudio;
    
    @Column(name = "educacion_id")
    private Long educacionId;

 

}
