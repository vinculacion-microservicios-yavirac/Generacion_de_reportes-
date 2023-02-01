package generacion_de_reportes.api_modulos.formulario_final_estudiante;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FormulariofinalestudianteRepository extends JpaRepository<Formulariofinalestudiante, Long>{
    public List<Formulariofinalestudiante> findAll();
}