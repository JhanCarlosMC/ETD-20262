package co.edu.uniquindio.comparables.ejemplo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MainEstudiante {
    static void main() {
        LinkedList<Estudiante> estudiantes = new LinkedList<>();
        Estudiante estudiante1 = new Estudiante("Jhan", "A1234", 25, 1.83);
        Estudiante estudiante2 = new Estudiante("Carlos", "C4321", 19, 1.70);
        Estudiante estudiante3 = new Estudiante("pepe", "B3456", 17, 1.90);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        Collections.sort(estudiantes);

//        PriorityQueue<Estudiante> prioridadEstudiantes = new PriorityQueue<>(new EstudianteComparator());
        PriorityQueue<Estudiante> prioridadEstudiantes = new PriorityQueue<>();
        prioridadEstudiantes.add(estudiante1);
        prioridadEstudiantes.add(estudiante2);
        prioridadEstudiantes.add(estudiante3);

//        for (Estudiante estudiante : prioridadEstudiantes) {
//            System.out.println(estudiante);
//        }
        IO.println(prioridadEstudiantes.poll());
        IO.println(prioridadEstudiantes.poll());
        IO.println(prioridadEstudiantes.poll());
    }
}
