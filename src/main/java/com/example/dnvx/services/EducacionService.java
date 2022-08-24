package com.example.dnvx.services;

import com.example.dnvx.Repository.EducacionRepo;
import com.example.dnvx.models.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    private final EducacionRepo educacionRepo;

    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }
    public void borrarEducaion(long id){
    educacionRepo.deleteById(id);
    }
}
