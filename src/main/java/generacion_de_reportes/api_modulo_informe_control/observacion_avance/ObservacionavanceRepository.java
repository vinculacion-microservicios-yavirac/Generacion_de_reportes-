package generacion_de_reportes.api_modulo_informe_control.observacion_avance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservacionavanceRepository  extends JpaRepository<Observacionavance, Long>{
    public List<Observacionavance> findAll();
}
