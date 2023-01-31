package generacion_de_reportes.api_modulos.informe_control;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InformecontrolRepository extends JpaRepository<Informecontrol, Long>{
    public List<Informecontrol> findAll();
}