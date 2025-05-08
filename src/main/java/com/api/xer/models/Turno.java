package com.api.xer.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private Long c_id_grupo;

    private LocalDateTime fh_entrada;

    private LocalDateTime fh_salida;

    private LocalDateTime fh_actualizacion;

    private BigDecimal n_monto_hora;

    private Long c_id_tareas;

    private Long c_id_notas;

    // Getters y setters

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public Long getC_id_grupo() {
        return c_id_grupo;
    }

    public void setC_id_grupo(Long c_id_grupo) {
        this.c_id_grupo = c_id_grupo;
    }

    public LocalDateTime getFh_entrada() {
        return fh_entrada;
    }

    public void setFh_entrada(LocalDateTime fh_entrada) {
        this.fh_entrada = fh_entrada;
    }

    public LocalDateTime getFh_salida() {
        return fh_salida;
    }

    public void setFh_salida(LocalDateTime fh_salida) {
        this.fh_salida = fh_salida;
    }

    public LocalDateTime getFh_actualizacion() {
        return fh_actualizacion;
    }

    public void setFh_actualizacion(LocalDateTime fh_actualizacion) {
        this.fh_actualizacion = fh_actualizacion;
    }

    public BigDecimal getN_monto_hora() {
        return n_monto_hora;
    }

    public void setN_monto_hora(BigDecimal n_monto_hora) {
        this.n_monto_hora = n_monto_hora;
    }

    public Long getC_id_tareas() {
        return c_id_tareas;
    }

    public void setC_id_tareas(Long c_id_tareas) {
        this.c_id_tareas = c_id_tareas;
    }

    public Long getC_id_notas() {
        return c_id_notas;
    }

    public void setC_id_notas(Long c_id_notas) {
        this.c_id_notas = c_id_notas;
    }
}
