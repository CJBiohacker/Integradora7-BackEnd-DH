package com.example.mesaIntegradora7.controllers;

import com.example.mesaIntegradora7.models.Dentista;
import com.example.mesaIntegradora7.services.DentistaServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {
    @Autowired
    DentistaServiceImplementation dentistaService;

    @GetMapping("/save")
    public Dentista save(@RequestParam(value = "id") int id,
                         @RequestParam(value = "nome") String nome,
                         @RequestParam(value = "email") String email,
                         @RequestParam(value = "matricula") int matricula,
                         @RequestParam(value = "atendeConvenio") boolean atendeConvenio){
        return dentistaService.save(new Dentista(id, nome, email, matricula, atendeConvenio));
    }

    @GetMapping("/all")
    public List<Dentista> getAll(){
        return dentistaService.getAll();
    }

    @GetMapping("/{id}")
    public Dentista getById(@PathVariable int id){
        return dentistaService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return dentistaService.deleteById(id);
    }
}
