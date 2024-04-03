package org.example;

import java.util.List;
import java.util.ArrayList;


public class Materia {
 public String nombre;

 public List<Materia> correlativas;

 public Materia(String nombre) {
  this.nombre = nombre;
  this.correlativas = new ArrayList<Materia>(); // Inicializar la lista de correlativas
 }


 public void addCorrelativa(Materia materia) {
     correlativas.add(materia);
 }
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
}
