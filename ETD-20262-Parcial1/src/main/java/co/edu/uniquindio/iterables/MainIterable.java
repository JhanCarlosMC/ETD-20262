package co.edu.uniquindio.iterables;

public class MainIterable {
    static void main() {
        Inventario miInventario = new Inventario();
        miInventario.agregarObjeto("PC");
        miInventario.agregarObjeto("Celular");
        miInventario.agregarObjeto("Cuaderno");
        //TipoDato Nombre
//        for(String objeto: miInventario){
//            IO.println(objeto);
//        }

        NotasIterable misNotas = new NotasIterable();
        misNotas.agregarNota(5);
        misNotas.agregarNota(4);
        misNotas.agregarNota(3);
        misNotas.agregarNota(2);

        for (Integer nota: misNotas){
            IO.println(nota);
        }
    }
}
