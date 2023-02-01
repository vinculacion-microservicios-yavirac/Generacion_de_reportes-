package generacion_de_reportes.api_modulos.informe_inicial;

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
@RequestMapping("api/informeinicial")
@CrossOrigin({"*"})

public class InformeinicialController {

    @Autowired InformeinicialService informeinicialService;


    @GetMapping("/")
    public List<Informeinicial> findAll(){
        return informeinicialService.findAll();
    }

    @GetMapping("/{id}")
    public Informeinicial   findById(@PathVariable Long id){
        return informeinicialService.findById(id);
    }


    @PostMapping("/")
    public Informeinicial save(@RequestBody Informeinicial entity){
        return informeinicialService.save(entity);
    }


    @PutMapping("/")
    public Informeinicial update(@RequestBody Informeinicial entity){
        return informeinicialService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        informeinicialService.deleteById(id);
    }
    
}
