package generacion_de_reportes.api_modulos.avance_cumplimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AvancecumplimientoService {
    @Autowired AvancecumplimientoRepository avancecumplimientoRepository;

    public Avancecumplimiento save(Avancecumplimiento entity){
        return avancecumplimientoRepository.save(entity);

    }

    public Avancecumplimiento findById(Long id){
        return avancecumplimientoRepository.findById(id).orElse(new Avancecumplimiento());

    }

    public void deleteById(Long id){
        avancecumplimientoRepository.deleteById(id);
    }

    public List<Avancecumplimiento> findAll(){
        return avancecumplimientoRepository.findAll();
    }



    
}
