package generacion_de_reportes.api_modulos.formulario_final_tutor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Formulariofinaltutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_proyecto;
    private String nom_ent_beneficiaria;
    private String email;
    private Integer telefono;
    private String direccion;
    private String tutor_vinculacion;
    private String tutor_proyecto;
    private Date fecha_inicio;


    
    
}
