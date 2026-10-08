package co.edu.uniquindio.comparables.ejemplo;

import java.util.Comparator;

public class EstudianteComparator implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante e1, Estudiante e2) {
        return Integer.compare(e2.getEdad(), e1.getEdad());
    }
}
