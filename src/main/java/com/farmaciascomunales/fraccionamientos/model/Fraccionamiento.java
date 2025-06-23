package com.farmaciascomunales.fraccionamientos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Fraccionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idProducto;
    private Long idBeneficiario;

    private int cantidadOriginal;
    private int cantidadFraccionada;

    private String lote;
    private LocalDate fecha;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public Long getIdBeneficiario() { return idBeneficiario; }

    public void setIdBeneficiario(Long idBeneficiario) { this.idBeneficiario = idBeneficiario; }

    public int getCantidadOriginal() { return cantidadOriginal; }

    public void setCantidadOriginal(int cantidadOriginal) { this.cantidadOriginal = cantidadOriginal; }

    public int getCantidadFraccionada() { return cantidadFraccionada; }

    public void setCantidadFraccionada(int cantidadFraccionada) { this.cantidadFraccionada = cantidadFraccionada; }

    public String getLote() { return lote; }

    public void setLote(String lote) { this.lote = lote; }

    public LocalDate getFecha() { return fecha; }

    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}