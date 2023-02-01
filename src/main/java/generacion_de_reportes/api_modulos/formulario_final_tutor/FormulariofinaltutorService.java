package generacion_de_reportes.api_modulos.formulario_final_tutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FormulariofinaltutorService {
    
    @Autowired FormulariofinaltutorRepository formulariofinaltutorRepository;

    public Formulariofinaltutor save(Formulariofinaltutor entity){
        return formulariofinaltutorRepository.save(entity);

    }

    public Formulariofinaltutor findById(Long id){
        return formulariofinaltutorRepository.findById(id).orElse(new Formulariofinaltutor());

    }

    public void deleteById(Long id){
        formulariofinaltutorRepository.deleteById(id);
    }

    public List<Formulariofinaltutor> findAll(){
        return formulariofinaltutorRepository.findAll();
    }
}
