package com.example.mesaIntegradora7.services;

import com.example.mesaIntegradora7.models.Dentista;
import com.example.mesaIntegradora7.models.Usuario;

import java.util.List;

public interface DentistaService<T> {
    Dentista save(Dentista dentista);
    List<T> getAll();
    String deleteById(int id);
    T getById(int id);
}