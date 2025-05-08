package com.api.xer.models;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "espacio")
public class Espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String d_descripcion;

    private LocalDateTime fh_alta;

    private LocalDateTime fh_baja;

    private LocalDateTime fh_actualizacion;

    private String c_codigo;

    private Boolean m_activo;

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

    public LocalDateTime getFh_actualizacion() {
        return fh_actualizacion;
    }

    public void setFh_actualizacion(LocalDateTime fh_actualizacion) {
        this.fh_actualizacion = fh_actualizacion;
    }

    public String getC_codigo() {
        return c_codigo;
    }

    public void setC_codigo(String c_codigo) {
        this.c_codigo = c_codigo;
    }

    public Boolean getM_activo() {
        return m_activo;
    }

    public void setM_activo(Boolean m_activo) {
        this.m_activo = m_activo;
    }
}
