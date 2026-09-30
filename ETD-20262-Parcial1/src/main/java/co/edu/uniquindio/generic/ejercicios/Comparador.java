package co.edu.uniquindio.generic.ejercicios;

public class Comparador<T extends Comparable<T>> {

    public T mayor(T a, T b){

        if(a.compareTo(b) > 0){
            return a;
        }else{
            return b;
        }

    }

}
