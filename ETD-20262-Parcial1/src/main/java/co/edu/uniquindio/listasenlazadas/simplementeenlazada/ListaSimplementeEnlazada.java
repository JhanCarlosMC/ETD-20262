package co.edu.uniquindio.listasenlazadas.simplementeenlazada;

public class ListaSimplementeEnlazada {

    private Nodo inicio;
    private int tam;

    public ListaSimplementeEnlazada(){
        inicio = null;
        tam = 0;
    }

    //Metodo para agregar un nodo al inicio de la lista
    public void agregarInicio(String dato){
        Nodo nuevoNodo = new Nodo(dato);

        nuevoNodo.setSiguiente(inicio);
        inicio = nuevoNodo;
        tam++;
    }

    public void agregarFinal(String dato){
        Nodo nuevo = new Nodo(dato);

        if(tam == 0 && inicio == null){
            inicio = nuevo;
        }else{
            Nodo aux = inicio;

            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }
        tam++;
    }

    public void eliminarInicio(){
        inicio = inicio.getSiguiente();
        tam--;
    }

    public void eliminarFinal(){
        if (tam == 1 && inicio.getSiguiente() == null){
            inicio = null;
        }else{
            Nodo aux = inicio;

            while(aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(null);
        }
        tam--;
    }

    //1. Trear la lista simple enlazada Generica
    //2. Agregar en una posicion específica
    //3. Eliminar en una posicion específica

    public boolean buscar(String datoBuscar){
        Nodo aux = inicio;
        boolean flag = false;

        while (aux != null){
            if(aux.getDato().equals(datoBuscar)){
                flag = true;
                break;
            }

            aux = aux.getSiguiente();
        }

        return flag;
    }

    public int localizar(String datoBuscar){
        Nodo aux = inicio;
        int count = 0;

        while (aux != null){
            if(aux.getDato().equals(datoBuscar)){
                return count;
            }
            count++;
            aux = aux.getSiguiente();
        }

        return -1;
    }

    public String mostrar(){
        String listaString = "[";

        if(inicio == null && tam == 0){
            listaString += " Null";
        }else{
            Nodo aux = inicio;

            while (aux != null){
                listaString += " " + aux.getDato();
                aux = aux.getSiguiente();
            }
        }
        listaString += " ]";

        return listaString;
    }





    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
