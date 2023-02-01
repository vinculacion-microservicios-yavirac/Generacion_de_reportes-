package generacion_de_reportes.api_modulos.informe_inicial;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InformeinicialRepository extends JpaRepository<Informeinicial, Long>{
    public List<Informeinicial> findAll();
}