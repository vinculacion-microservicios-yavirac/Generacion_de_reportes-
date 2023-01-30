package generacion_de_reportes.api_modulo_informe_control.encuesta.respuesta;

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
@RequestMapping("api/encuesta")
@CrossOrigin({"*"})
public class RespuestaController {
    
    @Autowired RespuestaService respuestaService;


    @GetMapping("/")
    public List<Respuesta> findAll(){
        return respuestaService.findAll();
    }

    @GetMapping("/{id}")
    public Respuesta findById(@PathVariable Long id){
        return 
        respuestaService.findById(id);
    }


    @PostMapping("/")
    public Respuesta save(@RequestBody Respuesta entity){
        return respuestaService.save(entity);
    }


    @PutMapping("/")
    public Respuesta update(@RequestBody Respuesta entity){
        return respuestaService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        respuestaService.deleteById(id);
    }
}
