package generacion_de_reportes.api_modulo_informe_control.encuesta.respuesta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService {

    @Autowired RespuestaRepository respuestaRepository;

    public Respuesta save(Respuesta entity){
        return respuestaRepository.save(entity);

    }

    public Respuesta findById(Long id){
        return respuestaRepository.findById(id).orElse(new Respuesta());

    }

    public void deleteById(Long id){
        respuestaRepository.deleteById(id);
    }

    public List<Respuesta> findAll(){
        return respuestaRepository.findAll();
    }

    
}
