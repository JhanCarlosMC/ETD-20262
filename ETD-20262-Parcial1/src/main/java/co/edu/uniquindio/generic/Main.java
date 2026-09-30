package co.edu.uniquindio.generic;

import co.edu.uniquindio.generic.classgeneric.Caja;
import co.edu.uniquindio.generic.classgeneric.CajaDos;
import co.edu.uniquindio.generic.classgeneric.CajaGenerica;
import co.edu.uniquindio.generic.classgeneric.CajaParesGenerica;
import co.edu.uniquindio.generic.interfacegeneric.Concatenar;
import co.edu.uniquindio.generic.interfacegeneric.Suma;

public class Main {
    static void main() {
//        implementacionNOGenerica();
//        implementacionGenerica();
        implementacionInterfaceGenerica();

    }

    private static void implementacionInterfaceGenerica() {
        Suma miOperacion = new Suma();
        IO.println(miOperacion.operar(3,5));

        Concatenar miTexto = new Concatenar();
        IO.println(miTexto.operar("HOla", "A todos"));

    }


    public static void implementacionGenerica(){
        CajaGenerica<String> miCajaGenerica = new CajaGenerica<>("Ropa");
        IO.println(miCajaGenerica.getDato());

        CajaGenerica<Integer> miCajita = new CajaGenerica<>(25);
        IO.println(miCajita.getDato());

        CajaParesGenerica<Integer, String> pares = new CajaParesGenerica<>(1, "Hola");
        pares.cambiar(10.2);

    }

    public static void implementacionNOGenerica(){
        Caja miCaja = new Caja("Zapatos");
        IO.println(miCaja.getDato());

        CajaDos miSegundaCaja = new CajaDos(20000);
        IO.println(miSegundaCaja.getDato());
    }
}
