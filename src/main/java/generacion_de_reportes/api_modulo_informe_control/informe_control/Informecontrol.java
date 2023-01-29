package generacion_de_reportes.api_modulo_informe_control.informe_control;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Informecontrol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String proyecto;
    private String carrera;
    private String nombre;
    private String semestre;
    private String apellido;
    private String nombredelaentidad;
    private String direccion;
    private String descripcionTutor;
    private String descripcionTutorAcademico;
    private String seguimientoProyecto;
    private String procesoEvaluacion;





    
}
