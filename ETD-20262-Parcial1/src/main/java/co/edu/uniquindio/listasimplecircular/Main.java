package co.edu.uniquindio.listasimplecircular;

public class Main {

    static void main() {
        ListaCircularSimple<String> listaCiruclar = new ListaCircularSimple<>();
        listaCiruclar.agregarFinal("Carlos");
        listaCiruclar.agregarInicio("Jhan");
        listaCiruclar.agregarFinal("Martinez");
        listaCiruclar.agregarFinal("Ceballos");
        IO.println(listaCiruclar.mostrar());

        IO.println(listaCiruclar.buscar("Carlos"));
        IO.println(listaCiruclar.buscar("Mario"));
        IO.println(listaCiruclar.localizar("Ceballos"));
        IO.println(listaCiruclar.localizar("Perez"));

        listaCiruclar.eliminarInicio();
        listaCiruclar.eliminarFinal();
        IO.println(listaCiruclar.mostrar());

    }
}
