package co.edu.uniquindio.generic.ejercicios;

import co.edu.uniquindio.generic.classgeneric.CajaGenerica;

//Clase Comparador<T extends Comparable<T>>
// Crear una clase genérica con un método mayor(T a, T b)
//  que devuelva el mayor entre dos elementos comparables.
public class Main {
    static void main() {
        Comparador<Integer> comparador = new Comparador<>();

        IO.println(comparador.mayor(100,20));

        Comparador<String> comparadorTexto = new Comparador<>();

        IO.println(comparadorTexto.mayor("Jhan","Ana"));

        Comparador<CajaGenerica<String>> miComparadorCaja = new Comparador<CajaGenerica<String>>();
    }
}
