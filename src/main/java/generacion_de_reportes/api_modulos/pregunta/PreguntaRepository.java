package generacion_de_reportes.api_modulos.pregunta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    
    public List<Pregunta> findAll();
}
