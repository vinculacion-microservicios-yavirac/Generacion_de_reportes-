package generacion_de_reportes.api_modulos.informe_inicial;

import java.io.File;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Informeinicial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String dirigido_a;
    private String asunto;
    private Date fecha_actual;
    private String observaciones;
    private File apellido;   
}
