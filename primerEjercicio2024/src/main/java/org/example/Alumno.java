package org.example;

import java.util.List;
import java.util.ArrayList;

public class Alumno {

    public Integer legajo;
    public String nombre;

    public List<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public Alumno(String nombre,Integer legajo) {
        this.nombre = nombre;
        this.materiasAprobadas= new ArrayList<>();
        this.legajo = legajo;
    }
}
