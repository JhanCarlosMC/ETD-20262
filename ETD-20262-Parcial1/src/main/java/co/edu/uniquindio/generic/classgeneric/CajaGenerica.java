package co.edu.uniquindio.generic.classgeneric;

public class CajaGenerica<E> implements Comparable<CajaGenerica<String>> {
    private E dato;

    public CajaGenerica(E dato){
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    @Override
    public int compareTo(CajaGenerica<String> o) {
        return 0;
    }
}
