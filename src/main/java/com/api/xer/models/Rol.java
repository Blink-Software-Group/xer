package com.api.xer.models;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String d_descripcion;

    private LocalDateTime fh_alta;

    private LocalDateTime fh_baja;

    // Getters y setters

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

    public LocalDateTime getFh_alta() {
        return fh_alta;
    }

    public void setFh_alta(LocalDateTime fh_alta) {
        this.fh_alta = fh_alta;
    }

    public LocalDateTime getFh_baja() {
        return fh_baja;
    }

    public void setFh_baja(LocalDateTime fh_baja) {
        this.fh_baja = fh_baja;
    }
}
