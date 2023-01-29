package generacion_de_reportes.api_modulo_informe_control.avance_cumplimiento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AvancecumplimientoRepository extends JpaRepository<Avancecumplimiento, Long>{
    public List<Avancecumplimiento> findAll();
}