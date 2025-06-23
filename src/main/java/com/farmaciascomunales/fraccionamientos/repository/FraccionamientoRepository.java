package com.farmaciascomunales.fraccionamientos.repository;

import com.farmaciascomunales.fraccionamientos.model.Fraccionamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraccionamientoRepository extends JpaRepository<Fraccionamiento, Long> {
}