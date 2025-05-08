package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private Long c_id_usuario;

    private String d_calle;

    private String d_numero;

    private String d_piso;

    private String d_dpto;

    private LocalDateTime fh_alta;

    private LocalDateTime fh_actualizacion;

    private String d_cod_postal;

    private String d_observaciones;

    private Boolean m_activo;

    // Getters y setters

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public Long getC_id_usuario() {
        return c_id_usuario;
    }

    public void setC_id_usuario(Long c_id_usuario) {
        this.c_id_usuario = c_id_usuario;
    }

    public String getD_calle() {
        return d_calle;
    }

    public void setD_calle(String d_calle) {
        this.d_calle = d_calle;
    }

    public String getD_numero() {
        return d_numero;
    }

    public void setD_numero(String d_numero) {
        this.d_numero = d_numero;
    }

    public String getD_piso() {
        return d_piso;
    }

    public void setD_piso(String d_piso) {
        this.d_piso = d_piso;
    }

    public String getD_dpto() {
        return d_dpto;
    }

    public void setD_dpto(String d_dpto) {
        this.d_dpto = d_dpto;
    }

    public LocalDateTime getFh_alta() {
        return fh_alta;
    }

    public void setFh_alta(LocalDateTime fh_alta) {
        this.fh_alta = fh_alta;
    }

    public LocalDateTime getFh_actualizacion() {
        return fh_actualizacion;
    }

    public void setFh_actualizacion(LocalDateTime fh_actualizacion) {
        this.fh_actualizacion = fh_actualizacion;
    }

    public String getD_cod_postal() {
        return d_cod_postal;
    }

    public void setD_cod_postal(String d_cod_postal) {
        this.d_cod_postal = d_cod_postal;
    }

    public String getD_observaciones() {
        return d_observaciones;
    }

    public void setD_observaciones(String d_observaciones) {
        this.d_observaciones = d_observaciones;
    }

    public Boolean getM_activo() {
        return m_activo;
    }

    public void setM_activo(Boolean m_activo) {
        this.m_activo = m_activo;
    }
}
