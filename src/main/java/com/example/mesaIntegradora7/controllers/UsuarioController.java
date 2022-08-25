package com.example.mesaIntegradora7.controllers;

import com.example.mesaIntegradora7.models.Usuario;
import com.example.mesaIntegradora7.services.UsuarioServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioServiceImplementation usuarioService;

    @GetMapping("/save")
    public Usuario save(@RequestParam(value = "id") int id,
                        @RequestParam(value = "nome") String nome,
                        @RequestParam(value = "email") String email,
                        @RequestParam(value = "senha") String senha,
                        @RequestParam(value = "nivelAcesso") String nivelAcesso){
        return usuarioService.save(new Usuario(id, nome, email, senha, nivelAcesso));
    }

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable int id){
        return usuarioService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return usuarioService.deleteById(id);
    }
}
