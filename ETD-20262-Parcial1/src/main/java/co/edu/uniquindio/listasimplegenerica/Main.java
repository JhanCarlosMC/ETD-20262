package co.edu.uniquindio.listasimplegenerica;

import java.util.Iterator;

public class Main {
    static void main() {
        ListaSimplementeEnlazada<String> listaString = new ListaSimplementeEnlazada<>();

        listaString.agregarFinal("Hola");
        listaString.agregarFinal("Carlos");
        listaString.agregarFinal("UQ");
        listaString.agregarFinal("Sistemas");

//        for (String valor: listaString){
//            System.out.println(valor);
//        }

        Iterator<String> miIterator = listaString.iterator();
        while(miIterator.hasNext()){
            IO.println(miIterator.next());
        }
    }
}
