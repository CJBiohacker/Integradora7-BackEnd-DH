package com.example.mesaIntegradora7.services;

import com.example.mesaIntegradora7.models.Usuario;

import java.util.List;

public interface UsuarioService<T> {
    Usuario save(Usuario usuario);
    List<T> getAll();
    String deleteById(int id);
    T getById(int id);
}