
package com.example.dnvx.services;

import com.example.dnvx.Repository.ProyectoRepo;
import com.example.dnvx.models.Proyecto;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProyectoService {
      private final ProyectoRepo proyectoRepo;

    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> buscarProyecto() {
        return proyectoRepo.findAll();
    }

    public Proyecto editarProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }
    public void borrarProyecto(long id){
    proyectoRepo.deleteById(id);
    }
    
}
