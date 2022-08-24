
package com.example.dnvx.controller;

import com.example.dnvx.models.Skills;
import com.example.dnvx.services.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/skill")
public class SkillsController {
    @Autowired
     private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
     @PutMapping
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skills) {
        Skills updateSkill = skillsService.editarSkill(skills);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }
    

   @GetMapping
    public ResponseEntity<List<Skills>> obtenerSkill(){
        List<Skills> skills = skillsService.buscarSkill();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Skills> crearSkill(@RequestBody Skills skills){
    Skills nuevaSkill=skillsService.addSkill(skills);
    return new ResponseEntity<>(nuevaSkill, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?>borrarEducacion(@PathVariable("id")Long id){
    skillsService.borrarSkill(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
