package generacion_de_reportes.api_modulos.formulario_final_tutor;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FormulariofinaltutorRepository extends JpaRepository<Formulariofinaltutor, Long>{
    public List<Formulariofinaltutor> findAll();
}