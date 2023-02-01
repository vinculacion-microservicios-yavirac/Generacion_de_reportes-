package generacion_de_reportes.api_modulos.formulario_final_tutor;

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
@RequestMapping("api/formulariofinaltutor")
@CrossOrigin({"*"})

public class FormulariofinaltutorController {

    @Autowired FormulariofinaltutorService formulariofinaltutorService;


    @GetMapping("/")
    public List<Formulariofinaltutor> findAll(){
        return formulariofinaltutorService.findAll();
    }

    @GetMapping("/{id}")
    public Formulariofinaltutor  findById(@PathVariable Long id){
        return formulariofinaltutorService.findById(id);
    }


    @PostMapping("/")
    public Formulariofinaltutor save(@RequestBody Formulariofinaltutor entity){
        return formulariofinaltutorService.save(entity);
    }


    @PutMapping("/")
    public Formulariofinaltutor update(@RequestBody Formulariofinaltutor entity){
        return formulariofinaltutorService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        formulariofinaltutorService.deleteById(id);
    }
    
}
