package generacion_de_reportes.api_modulo_informe_control.informe_control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InformecontrolService {
    
    @Autowired InformecontrolRepository informecontrolRepository;

    public Informecontrol save(Informecontrol entity){
        return informecontrolRepository.save(entity);

    }

    public Informecontrol findById(Long id){
        return informecontrolRepository.findById(id).orElse(new Informecontrol());

    }

    public void deleteById(Long id){
        informecontrolRepository.deleteById(id);
    }

    public List<Informecontrol> findAll(){
        return informecontrolRepository.findAll();
    }
}
