package generacion_de_reportes.api_modulos.formulario_final_estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/formulariofinalestudiante")
@CrossOrigin({"*"})

public class FormulariofinalestudianteController {

    @Autowired FormulariofinalestudianteService formulariofinalestudianteService;


    @GetMapping("/")
    public List<Formulariofinalestudiante> findAll(){
        return formulariofinalestudianteService.findAll();
    }

    @GetMapping("/{id}")
    public Formulariofinalestudiante  findById(@PathVariable Long id){
        return formulariofinalestudianteService.findById(id);
    }


    @PostMapping("/")
    public Formulariofinalestudiante save(@RequestBody Formulariofinalestudiante entity){
        return formulariofinalestudianteService.save(entity);
    }


    @PutMapping("/")
    public Formulariofinalestudiante update(@RequestBody Formulariofinalestudiante entity){
        return formulariofinalestudianteService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        formulariofinalestudianteService.deleteById(id);
    }
    
}
