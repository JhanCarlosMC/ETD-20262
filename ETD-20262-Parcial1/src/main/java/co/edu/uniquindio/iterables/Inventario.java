package co.edu.uniquindio.iterables;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Inventario implements Iterable<String> {
    private String[] objetos = new String[10]; //List
    private int cantidad = 0;

    public void agregarObjeto(String item) {
        if (cantidad < objetos.length) {
            objetos[cantidad] = item;
            cantidad++;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new InventarioIterator();
    }

    private class InventarioIterator implements Iterator<String> {
        private int indexActual= 0;

        @Override
        public boolean hasNext() {
            return indexActual < cantidad;
        }

        @Override
        public String next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return objetos[indexActual++];
        }
    }

}
