package com.arquitectura.examen.tareas.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Estudiante {

    private Integer nivel;
    private String cedula;
    private String apellidos;
    private String nombres;
}
