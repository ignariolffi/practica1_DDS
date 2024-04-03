package org.example;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testInscripcion {

    Materia discreta;
    Materia algoritmos;
    Materia sistemas;
    Materia analisis;
    Materia paradigmas;
    Materia disenio;
    Alumno federico;
    Date fecha;

    @Test
    public void testInscripcionAprobada() {

        Materia discreta = new Materia("discreta");
        Materia algoritmos = new Materia("algoritmos");
        Materia sistemas = new Materia("sistemas");
        Materia analisis = new Materia("analisis");
        Materia paradigmas = new Materia("paradigmas");

        Materia disenio = new Materia("disenio");
        disenio.addCorrelativa(discreta);
        disenio.addCorrelativa(algoritmos);
        disenio.addCorrelativa(sistemas);
        disenio.addCorrelativa(analisis);
        disenio.addCorrelativa(paradigmas);

        Date fecha = new Date(2024, Calendar.MARCH,10);

        Alumno federico = new Alumno("federico",123456);
        federico.agregarMateriaAprobada(discreta);
        federico.agregarMateriaAprobada(algoritmos);
        federico.agregarMateriaAprobada(sistemas);
        federico.agregarMateriaAprobada(analisis);
        federico.agregarMateriaAprobada(paradigmas);

        Inscripcion inscripcion = new Inscripcion(federico);
        inscripcion.materiasAInscribirse.add(disenio);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testVariasMateriasInscripcionAprobada(){
        Materia discreta = new Materia("discreta");
        Materia algoritmos = new Materia("algoritmos");
        Materia sistemas = new Materia("sistemas");
        Materia analisis = new Materia("analisis");
        Materia paradigmas = new Materia("paradigmas");
        Materia analisis2 = new Materia("analisis2");

        analisis2.addCorrelativa(analisis);

        Materia disenio = new Materia("disenio");
        disenio.addCorrelativa(discreta);
        disenio.addCorrelativa(algoritmos);
        disenio.addCorrelativa(sistemas);
        disenio.addCorrelativa(analisis);
        disenio.addCorrelativa(paradigmas);

        Alumno federico = new Alumno("federico",123456);
        federico.agregarMateriaAprobada(discreta);
        federico.agregarMateriaAprobada(algoritmos);
        federico.agregarMateriaAprobada(sistemas);
        federico.agregarMateriaAprobada(analisis);
        federico.agregarMateriaAprobada(paradigmas);

        Inscripcion inscripcion = new Inscripcion(federico);
        inscripcion.materiasAInscribirse.add(disenio);
        inscripcion.materiasAInscribirse.add(analisis2);

        assertTrue(inscripcion.aprobada());
    }
    @Test
    public void testInscripcionNoAprobada() {
        Materia discreta = new Materia("discreta");
        Materia algoritmos = new Materia("algoritmos");
        Materia sistemas = new Materia("sistemas");
        Materia analisis = new Materia("analisis");
        Materia paradigmas = new Materia("paradigmas");

        Materia disenio = new Materia("disenio");
        disenio.addCorrelativa(discreta);
        disenio.addCorrelativa(algoritmos);
        disenio.addCorrelativa(sistemas);
        disenio.addCorrelativa(analisis);
        disenio.addCorrelativa(paradigmas);

        Alumno federico = new Alumno("federico",458789);
        federico.agregarMateriaAprobada(discreta);
        federico.agregarMateriaAprobada(algoritmos);
        federico.agregarMateriaAprobada(sistemas);
        federico.agregarMateriaAprobada(analisis);

        Inscripcion inscripcion = new Inscripcion(federico);
        inscripcion.materiasAInscribirse.add(disenio);

        assertFalse(inscripcion.aprobada());
    }
}
