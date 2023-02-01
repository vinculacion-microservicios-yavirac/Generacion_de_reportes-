package generacion_de_reportes.api_modulos.formulario_final_estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FormulariofinalestudianteService {
    
    @Autowired FormulariofinalestudianteRepository formulariofinaltutorRepository;

    public Formulariofinalestudiante save(Formulariofinalestudiante entity){
        return formulariofinaltutorRepository.save(entity);

    }

    public Formulariofinalestudiante findById(Long id){
        return formulariofinaltutorRepository.findById(id).orElse(new Formulariofinalestudiante());

    }

    public void deleteById(Long id){
        formulariofinaltutorRepository.deleteById(id);
    }

    public List<Formulariofinalestudiante> findAll(){
        return formulariofinaltutorRepository.findAll();
    }
}
