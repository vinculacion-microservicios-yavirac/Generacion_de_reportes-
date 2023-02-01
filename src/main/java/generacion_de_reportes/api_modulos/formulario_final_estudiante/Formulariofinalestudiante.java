package generacion_de_reportes.api_modulos.formulario_final_estudiante;

import java.io.File;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Formulariofinalestudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String avance;
    private String resultados_alcanzados;
    private String alcance;
    private String observaciones;
    private Date fecha_finalizacion_proyecto;
    private String comentarios_tutor;
    private File archivos_adjuntos;
    private String observaciones_tutor;
}
