package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String d_descripcion;

    private String c_id_estado;

    private LocalDateTime fh_alta;

    // Getters y Setters

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public String getD_descripcion() {
        return d_descripcion;
    }

    public void setD_descripcion(String d_descripcion) {
        this.d_descripcion = d_descripcion;
    }

    public String getC_id_estado() {
        return c_id_estado;
    }

    public void setC_id_estado(String c_id_estado) {
        this.c_id_estado = c_id_estado;
    }

    public LocalDateTime getFh_alta() {
        return fh_alta;
    }

    public void setFh_alta(LocalDateTime fh_alta) {
        this.fh_alta = fh_alta;
    }
}