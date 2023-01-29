package generacion_de_reportes.api_modulo_informe_control.observacion_avance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Entity
@Data
public class Observacionavance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String actividades;
    private String avancesCumplimiento;
    private String observaciones;
    
    
}
