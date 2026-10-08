package co.edu.uniquindio.listasimplegenerica;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaIterator<T> implements Iterator<T> {
    private Nodo<T> actual;

    public ListaIterator(Nodo<T> inicio) {
        actual = inicio;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T dato = actual.getDato();
        actual = actual.getSiguiente();

        return dato;
    }
}
