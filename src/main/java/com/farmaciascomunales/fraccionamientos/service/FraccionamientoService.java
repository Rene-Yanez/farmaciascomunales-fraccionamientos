package com.farmaciascomunales.fraccionamientos.service;

import com.farmaciascomunales.fraccionamientos.model.Fraccionamiento;
import com.farmaciascomunales.fraccionamientos.repository.FraccionamientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraccionamientoService {

    private final FraccionamientoRepository repository;

    public FraccionamientoService(FraccionamientoRepository repository) {
        this.repository = repository;
    }

    public List<Fraccionamiento> listar() {
        return repository.findAll();
    }

    public Fraccionamiento obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Fraccionamiento crear(Fraccionamiento f) {
        return repository.save(f);
    }
}