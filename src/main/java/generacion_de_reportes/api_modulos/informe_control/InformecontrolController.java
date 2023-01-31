package generacion_de_reportes.api_modulos.informe_control;

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
@RequestMapping("api/informecontrol")
@CrossOrigin({"*"})

public class InformecontrolController {

    @Autowired InformecontrolService informecontrolService;


    @GetMapping("/")
    public List<Informecontrol> findAll(){
        return informecontrolService.findAll();
    }

    @GetMapping("/{id}")
    public Informecontrol   findById(@PathVariable Long id){
        return informecontrolService.findById(id);
    }


    @PostMapping("/")
    public Informecontrol save(@RequestBody Informecontrol entity){
        return informecontrolService.save(entity);
    }


    @PutMapping("/")
    public Informecontrol update(@RequestBody Informecontrol entity){
        return informecontrolService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        informecontrolService.deleteById(id);
    }
    
}
