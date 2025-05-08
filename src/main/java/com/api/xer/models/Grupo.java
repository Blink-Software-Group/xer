package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private Long d_id_espacio;

    private Long c_id_rol;

    private Long c_id_usuario;

    private LocalDateTime fh_alta;

    private LocalDateTime fh_baja;

    private LocalDateTime fh_actualizacion;

    private Boolean m_activo;

    // Getters y setters

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public Long getD_id_espacio() {
        return d_id_espacio;
    }

    public void setD_id_espacio(Long d_id_espacio) {
        this.d_id_espacio = d_id_espacio;
    }

    public Long getC_id_rol() {
        return c_id_rol;
    }

    public void setC_id_rol(Long c_id_rol) {
        this.c_id_rol = c_id_rol;
    }

    public Long getC_id_usuario() {
        return c_id_usuario;
    }

    public void setC_id_usuario(Long c_id_usuario) {
        this.c_id_usuario = c_id_usuario;
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

    public Boolean getM_activo() {
        return m_activo;
    }

    public void setM_activo(Boolean m_activo) {
        this.m_activo = m_activo;
    }
}
