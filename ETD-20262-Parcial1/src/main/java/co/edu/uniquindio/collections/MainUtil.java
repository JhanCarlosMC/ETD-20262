package co.edu.uniquindio.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MainUtil {
    static void main() {
        testArrays();
        //testCollections();
    }

    private static void testCollections() {
        ArrayList listaNotas = new ArrayList<>(Arrays.asList(2,3,5,1,0));

        IO.println(Collections.min(listaNotas));
        IO.println(Collections.max(listaNotas));

        Collections.sort(listaNotas);
        IO.println(listaNotas);

        Collections.reverse(listaNotas);
        IO.println(listaNotas);

        Collections.shuffle(listaNotas);
        IO.println(listaNotas);
    }

    public static void testArrays(){
        String[] nombresEstudiantes = {"Jhan", "Juan", "Sergio", "Pedro", "Maria"};

        IO.println(nombresEstudiantes);
        IO.println(Arrays.toString(nombresEstudiantes));

        Arrays.sort(nombresEstudiantes);
        IO.println(Arrays.toString(nombresEstudiantes));

        int index = Arrays.binarySearch(nombresEstudiantes, "Pedro");
        IO.println(index);

        Arrays.fill(nombresEstudiantes, "J");
        IO.println(Arrays.toString(nombresEstudiantes));
    }

}
