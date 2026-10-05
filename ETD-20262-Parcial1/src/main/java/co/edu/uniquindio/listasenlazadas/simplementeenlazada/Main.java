package co.edu.uniquindio.listasenlazadas.simplementeenlazada;

public class Main {

    static void main() {
        ListaSimplementeEnlazada miLista = new ListaSimplementeEnlazada();

        miLista.agregarFinal("Jhan");
        miLista.agregarInicio("Carlos");
        miLista.agregarFinal("Martinez");
        miLista.agregarFinal("Ceballos");

        IO.println(miLista.mostrar());

        IO.println(miLista.buscar("Ceballos"));
        IO.println(miLista.localizar("Carlos"));
        IO.println(miLista.localizar("12"));

        miLista.eliminarInicio();
        IO.println(miLista.mostrar());

        miLista.eliminarFinal();
        IO.println(miLista.mostrar());

    }
}
