package generacion_de_reportes.api_modulos.pregunta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaService {

    @Autowired PreguntaRepository preguntaRepository;

    public Pregunta save(Pregunta entity){
        return preguntaRepository.save(entity);

    }

    public Pregunta findById(Long id){
        return preguntaRepository.findById(id).orElse(new Pregunta());

    }

    public void deleteById(Long id){
        preguntaRepository.deleteById(id);
    }

    public List<Pregunta> findAll(){
        return preguntaRepository.findAll();
    }

    
}
