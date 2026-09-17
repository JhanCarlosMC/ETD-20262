package co.edu.uniquindio.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainList {
    static void main() {
        //testArrayslist();
        testLinkedList();
    }

    public static void testArrayslist(){
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(5);
        notas.add(5);
        notas.add(43);
        notas.add(3);
        notas.add(65);
        notas.add(13);
        IO.println(notas);
        notas.add(0,1);
        IO.println(notas);

        IO.println(notas.get(0));

        Integer notaELiminar = 43;
        IO.println(notas.contains(notaELiminar));
        IO.println(notas.indexOf(notaELiminar));
        notas.remove(notaELiminar);
        IO.println(notas);

        notas.remove(0);
        IO.println(notas);
        IO.println(notas.size());
        IO.println(notas.contains(notaELiminar));
        IO.println(notas.indexOf(notaELiminar));
        IO.println(notas.isEmpty());

    }

    public static void testLinkedList(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("JS");
        lista.add("C#");
        lista.add("Cobol");

        //ListIterator - Se aplica a cualquier lista
        ListIterator<String> listIterator = lista.listIterator();

        IO.println("Iniciando recorrido con iterador:");
        while (listIterator.hasNext()){
            IO.println(listIterator.next());
        }

        IO.println("Iniciando recorrido contrario con iterador:");
        while (listIterator.hasPrevious()){
            IO.println(listIterator.previous());
        }
    }
}
