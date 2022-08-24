/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dnvx.services;

import com.example.dnvx.Repository.SkillsRepo;
import com.example.dnvx.models.Skills;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
@Transactional
public class SkillsService {
       private final SkillsRepo skillsRepo;

    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkill(Skills skills) {
        return skillsRepo.save(skills);
    }

    public List<Skills> buscarSkill() {
        return skillsRepo.findAll();
    }

    public Skills editarSkill(Skills skills) {
        return skillsRepo.save(skills);
    }
    public void borrarSkill(long id){
    skillsRepo.deleteById(id);
    }
}
