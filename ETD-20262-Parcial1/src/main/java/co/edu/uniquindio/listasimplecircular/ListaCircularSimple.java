package co.edu.uniquindio.listasimplecircular;

public class ListaCircularSimple<T> {

    private Nodo<T> inicio;
    private int tam;

    public ListaCircularSimple() {
        inicio = null;
        tam = 0;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     */
    public void agregarInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if(inicio == null && tam == 0){
            inicio = nuevoNodo;
            inicio.setSiguiente(inicio);
        }else{
            Nodo<T> aux = inicio;

            while (aux.getSiguiente() != inicio){
                aux = aux.getSiguiente();
            }
            nuevoNodo.setSiguiente(inicio);
            aux.setSiguiente(nuevoNodo);

            inicio = nuevoNodo;
        }
        tam++;
    }

    /**
     * Agrega un elemento al final de la lista.
     */
    public void agregarFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (inicio == null && tam == 0) {
            inicio = nuevo;
            inicio.setSiguiente(inicio);
        } else {

            Nodo<T> aux = inicio;
            while (aux.getSiguiente() != inicio) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
        tam++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void eliminarInicio() {

        if(inicio == null && tam == 0)
            return;

        if(tam == 1){
            inicio = null;
        }else{
            Nodo<T> aux = inicio;

            while (aux.getSiguiente() != inicio){
                aux = aux.getSiguiente();
            }

            inicio = inicio.getSiguiente();
            aux.setSiguiente(inicio);
        }
        tam--;
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void eliminarFinal() {
        if(inicio == null && tam == 0)
            return;

        if(tam == 1){
            inicio = null;
        } else {
            Nodo<T> aux = inicio;
            while (aux.getSiguiente().getSiguiente() != inicio) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(inicio);
        }
        tam--;
    }

    /**
     * Busca un elemento dentro de la lista.
     */
    public boolean buscar(T datoBuscar) {
        if(inicio == null && tam == 0)
            return false;

        Nodo<T> aux = inicio;

        do{
            if (aux.getDato().equals(datoBuscar)) {
                return true;
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);

        return false;
    }

    /**
     * Retorna la posición del elemento dentro de la lista.
     * Si no existe retorna -1.
     */
    public int localizar(T datoBuscar) {
        if(inicio == null && tam == 0)
            return -1;

        Nodo<T> aux = inicio;
        int count = 0;

        do{
            if (aux.getDato().equals(datoBuscar)) {
                return count;
            }
            count++;
            aux = aux.getSiguiente();
        } while (aux != inicio);

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

            do{
                listaString += " " + aux.getDato();
                aux = aux.getSiguiente();
            } while (aux != inicio);
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
