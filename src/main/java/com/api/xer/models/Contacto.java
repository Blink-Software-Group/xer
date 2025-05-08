package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private Long c_id_usuario;

    private String d_descripcion;

    private String m_tipo_contacto;

    private LocalDateTime fh_alta;

    private LocalDateTime fh_actualizacion;

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

    public String getD_descripcion() {
        return d_descripcion;
    }

    public void setD_descripcion(String d_descripcion) {
        this.d_descripcion = d_descripcion;
    }

    public String getM_tipo_contacto() {
        return m_tipo_contacto;
    }

    public void setM_tipo_contacto(String m_tipo_contacto) {
        this.m_tipo_contacto = m_tipo_contacto;
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
}
