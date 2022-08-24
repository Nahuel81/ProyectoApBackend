/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dnvx.services;

import com.example.dnvx.Repository.ExperienciaRepo;
import com.example.dnvx.models.Experiencia;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
@Transactional
public class ExperienciaService {
    
     private final ExperienciaRepo experienciaRepo;

    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExperiencia() {
        return experienciaRepo.findAll();
    }

    public Experiencia editarExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(long id){
    experienciaRepo.deleteById(id);
    }
}
