package generacion_de_reportes.api_modulos.informe_inicial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InformeinicialService {
    
    @Autowired InformeinicialRepository informeinicialRepository;

    public Informeinicial save(Informeinicial entity){
        return informeinicialRepository.save(entity);

    }

    public Informeinicial findById(Long id){
        return informeinicialRepository.findById(id).orElse(new Informeinicial());

    }

    public void deleteById(Long id){
        informeinicialRepository.deleteById(id);
    }

    public List<Informeinicial> findAll(){
        return informeinicialRepository.findAll();
    }
}
