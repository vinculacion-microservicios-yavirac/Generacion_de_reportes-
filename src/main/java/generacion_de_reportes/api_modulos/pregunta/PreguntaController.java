package generacion_de_reportes.api_modulos.pregunta;

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
@RequestMapping("api/pregunta")
@CrossOrigin({"*"})
public class PreguntaController {
    
    @Autowired PreguntaService preguntaService;


    @GetMapping("/")
    public List<Pregunta> findAll(){
        return preguntaService.findAll();
    }

    @GetMapping("/{id}")
    public Pregunta findById(@PathVariable Long id){
        return preguntaService.findById(id);
    }


    @PostMapping("/")
    public Pregunta save(@RequestBody Pregunta entity){
        return preguntaService.save(entity);
    }


    @PutMapping("/")
    public Pregunta update(@RequestBody Pregunta entity){
        return preguntaService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        preguntaService.deleteById(id);
    }
}
