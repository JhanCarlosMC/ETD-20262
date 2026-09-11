package co.edu.uniquindio.comparables;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MainComparable {

    static void main() {
        LinkedList<Libro> biblioteca = new LinkedList<>();
        biblioteca.add(new Libro(2015,"Cien años de soledad"));
        biblioteca.add(new Libro(2018,"Programacion Orientada a Objetos"));
        biblioteca.add(new Libro(1980,"El quijote"));

        IO.println("Biblioteca: \n" + biblioteca);

        Collections.sort(biblioteca);
        IO.println("Biblioteca: \n" + biblioteca);

        Collections.sort(biblioteca,new LibrosComparator());
        IO.println("Biblioteca: \n" + biblioteca);

        Collections.sort(biblioteca, new Comparator<Libro>() {
            @Override
            public int compare(Libro libro1, Libro libro2) {
                return libro2.getTitulo().compareTo(libro1.getTitulo());
            }
        });
        IO.println("Biblioteca: \n" + biblioteca);

        biblioteca.sort((l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo()));

        biblioteca.sort(Comparator.comparing(Libro::getAnio));

    }

}
