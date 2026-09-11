package co.edu.uniquindio.iterables;

import java.util.Iterator;
import java.util.LinkedList;

public class NotasIterable implements Iterable<Integer>{
    private LinkedList<Integer> notas = new LinkedList<>();

    public void agregarNota(int nota){
        notas.add(nota);
    }

    @Override
    public Iterator<Integer> iterator() {
        return notas.listIterator();
    }
}
