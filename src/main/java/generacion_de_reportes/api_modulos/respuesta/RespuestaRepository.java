package generacion_de_reportes.api_modulos.respuesta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    
    public List<Respuesta> findAll();
}
