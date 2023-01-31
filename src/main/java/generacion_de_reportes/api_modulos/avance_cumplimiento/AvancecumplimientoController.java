package generacion_de_reportes.api_modulos.avance_cumplimiento;

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
@RequestMapping("api/avancecumplimiento")
@CrossOrigin({"*"})
public class AvancecumplimientoController {
    @Autowired AvancecumplimientoService avancecumplimientoService;


    @GetMapping("/")
    public List<Avancecumplimiento> findAll(){
        return avancecumplimientoService.findAll();
    }

    @GetMapping("/{id}")
    public Avancecumplimiento findById(@PathVariable Long id){
        return avancecumplimientoService.findById(id);
    }


    @PostMapping("/")
    public Avancecumplimiento save(@RequestBody Avancecumplimiento entity){
        return avancecumplimientoService.save(entity);
    }


    @PutMapping("/")
    public Avancecumplimiento update(@RequestBody Avancecumplimiento entity){
        return avancecumplimientoService.save(entity);
    }
    

    @DeleteMapping("/{id}/")
    public void deleteById (@PathVariable Long id ){
        avancecumplimientoService.deleteById(id);
    }

    
}
