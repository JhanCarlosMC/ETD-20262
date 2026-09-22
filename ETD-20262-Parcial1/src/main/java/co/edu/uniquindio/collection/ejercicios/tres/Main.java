package co.edu.uniquindio.collection.ejercicios.tres;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
//Crear una lista de elementos que no permite duplicados
// e imprima el contenido de la lista usando iteradores.
    static void main() {
        HashSet<String> listaElementos = new HashSet<>();

        listaElementos.add("j");
        listaElementos.add("h");
        listaElementos.add("a");
        listaElementos.add("n");
        listaElementos.add("j");
        listaElementos.add("a");
        listaElementos.add("13");
        listaElementos.add("n");



        Iterator<String> elementosIterator = listaElementos.iterator();

        while (elementosIterator.hasNext()){
            IO.println(elementosIterator.next());
        }
    }


}
