package co.edu.uniquindio.listasimplegenerica;

public class ListaSimplementeEnlazada<T> {

    private Nodo<T> inicio;
    private int tam;

    public ListaSimplementeEnlazada() {
        inicio = null;
        tam = 0;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     */
    public void agregarInicio(T dato) {

        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setSiguiente(inicio);
        inicio = nuevoNodo;
        tam++;
    }

    /**
     * Agrega un elemento al final de la lista.
     */
    public void agregarFinal(T dato) {

        Nodo<T> nuevo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {

            Nodo<T> aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }
        tam++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void eliminarInicio() {

        if (inicio != null) {
            inicio = inicio.getSiguiente();
            tam--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void eliminarFinal() {
        if (inicio == null) {
            return;
        }

        if (inicio.getSiguiente() == null) {
            inicio = null;
        } else {
            Nodo<T> aux = inicio;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
        tam--;
    }

    /**
     * Busca un elemento dentro de la lista.
     */
    public boolean buscar(T datoBuscar) {
        Nodo<T> aux = inicio;
        while (aux != null) {

            if (aux.getDato().equals(datoBuscar)) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }

    /**
     * Retorna la posición del elemento dentro de la lista.
     * Si no existe retorna -1.
     */
    public int localizar(T datoBuscar) {
        Nodo<T> aux = inicio;
        int count = 0;
        while (aux != null) {
            if (aux.getDato().equals(datoBuscar)) {
                return count;
            }
            count++;
            aux = aux.getSiguiente();
        }
        return -1;
    }

    /**
     * Retorna los elementos de la lista como String.
     */
    public String mostrar() {
        String listaString = "[";
        if (inicio == null) {
            listaString += " Null";
        } else {
            Nodo<T> aux = inicio;
            while (aux != null) {
                listaString += " " + aux.getDato();
                aux = aux.getSiguiente();
            }
        }
        listaString += " ]";
        return listaString;
    }


    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
