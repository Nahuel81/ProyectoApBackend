/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dnvx.services;

import com.example.dnvx.Repository.UsuarioRepo;
import com.example.dnvx.exception.UserNotFoundException;
import com.example.dnvx.models.Usuario;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsuarioService {
   private final UsuarioRepo usuarioRepo;

    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
    
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarUsuario() {
        return usuarioRepo.findAll();
    }

    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    public void borrarUsuario(long id){
    usuarioRepo.deleteById(id);
    }
   public Usuario buscarUsuarioPorId(Long id){
   return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("usuario no encontrado"));
   }
}
