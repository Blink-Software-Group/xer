package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "nota")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String d_descripcion;

    private Long c_id_turno;

    private LocalDateTime fh_alta;

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

    public Long getC_id_turno() {
        return c_id_turno;
    }

    public void setC_id_turno(Long c_id_turno) {
        this.c_id_turno = c_id_turno;
    }

    public LocalDateTime getFh_alta() {
        return fh_alta;
    }

    public void setFh_alta(LocalDateTime fh_alta) {
        this.fh_alta = fh_alta;
    }
}
