package org.example;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Inscripcion {

    Alumno alumno;
    Date fechaInscripcion;
    public List<Materia> materiasAInscribirse;

    public boolean aprobada() {
        for (Materia materia : materiasAInscribirse) {
            // Iterar sobre las correlativas de la materia actual
            for (Materia correlativa : materia.correlativas) {
                // Verificar si la correlativa no está en las materias aprobadas del alumno
                if (!alumno.materiasAprobadas.contains(correlativa)) {
                    return false; // Si falta alguna materia correlativa, retornar false
                }
            }
        }
        return true; // Si todas las materias y sus correlativas están aprobadas, retornar true
    }

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribirse = new ArrayList<Materia>();
        this.fechaInscripcion=new Date();
    }

}
