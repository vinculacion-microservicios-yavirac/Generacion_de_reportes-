package generacion_de_reportes.api_modulos.observacion_avance;

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
@RequestMapping("api/observacionesavance")
@CrossOrigin({"*"})
public class ObservacionavanceController {
    @Autowired ObservacionavanceService observacionavanceService;


    @GetMapping("/")
    public List<Observacionavance> findAll(){
        return observacionavanceService.findAll();
    }

    @GetMapping("/{id}")
    public Observacionavance   findById(@PathVariable Long id){
        return observacionavanceService.findById(id);
    }


    @PostMapping("/save")
    public Observacionavance save(@RequestBody Observacionavance entity){
        return observacionavanceService.save(entity);
    }


    @PutMapping("/")
    public Observacionavance update(@RequestBody Observacionavance entity){
        return observacionavanceService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        observacionavanceService.deleteById(id);
    }
    
    
}
