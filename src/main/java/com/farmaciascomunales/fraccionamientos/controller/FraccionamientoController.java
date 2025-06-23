package com.farmaciascomunales.fraccionamientos.controller;

import com.farmaciascomunales.fraccionamientos.model.Fraccionamiento;
import com.farmaciascomunales.fraccionamientos.service.FraccionamientoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fraccionamientos")
public class FraccionamientoController {

    private final FraccionamientoService service;

    public FraccionamientoController(FraccionamientoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Fraccionamiento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Fraccionamiento obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Fraccionamiento crear(@RequestBody Fraccionamiento f) {
        return service.crear(f);
    }
}