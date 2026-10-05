package co.edu.uniquindio.listasimplegenerica;

public class Main {
    static void main() {
        ListaSimplementeEnlazada<String> listaString = new ListaSimplementeEnlazada<>();
        ListaSimplementeEnlazada<Integer> listaInteger = new ListaSimplementeEnlazada<>();

        listaString.agregarFinal("Hola");
        listaInteger.agregarFinal(20);

    }
}
