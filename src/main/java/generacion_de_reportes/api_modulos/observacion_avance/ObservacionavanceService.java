package generacion_de_reportes.api_modulos.observacion_avance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservacionavanceService {
    @Autowired ObservacionavanceRepository observacionavanceRepository;

    public Observacionavance save(Observacionavance entity){
        return observacionavanceRepository.save(entity);

    }

    public Observacionavance findById(Long id){
        return observacionavanceRepository.findById(id).orElse(new Observacionavance());

    }

    public void deleteById(Long id){
        observacionavanceRepository.deleteById(id);
    }

    public List<Observacionavance> findAll(){
        return observacionavanceRepository.findAll();
    }
    
}
