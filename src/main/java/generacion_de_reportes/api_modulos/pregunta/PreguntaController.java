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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/pregunta")
@CrossOrigin({"*"})
public class PreguntaController {
    
    @Autowired PreguntaService preguntaService;


    @GetMapping("/findAll")
    public List<Pregunta> findAll(){
        return preguntaService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Pregunta findById(@PathVariable Long id){
        return preguntaService.findById(id);
    }


    @PostMapping("/save")
    public Pregunta save(@RequestBody Pregunta pregunta){
        return preguntaService.save(pregunta);
    }


    @PutMapping("/update")
    public Pregunta update(@RequestBody Pregunta pregunta){
        return preguntaService.save(pregunta);
    }
    

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id ){
        preguntaService.deleteById(id);
    }
}
