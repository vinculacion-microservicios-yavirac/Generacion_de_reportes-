package generacion_de_reportes.api_modulos.avance_cumplimiento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Avancecumplimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String resumenN;
    private String indicadoresF;
    private String mediosF;
    private String avanceC;
   

    


    
}
