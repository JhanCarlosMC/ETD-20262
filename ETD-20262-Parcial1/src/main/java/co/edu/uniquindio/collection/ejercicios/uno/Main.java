package co.edu.uniquindio.collection.ejercicios.uno;

public class Main {
    //Crear la lista de productos en una clase empresa utilizando treeset,
    // se debe realizar un método que busque un producto por su código.
    static void main() {

        Empresa miEmpresa = new Empresa();

        miEmpresa.agregarProducto(new Producto("01", "PC", 10000.0));
        miEmpresa.agregarProducto(new Producto("01", "PC", 10000.0));
        miEmpresa.agregarProducto(new Producto("02", "TV", 25000.0));
        miEmpresa.agregarProducto(new Producto("03", "Moto", 500000.0));

        IO.println(miEmpresa.cantidad());
        Producto productoEncontrado = miEmpresa.buscarProducto("02");
        IO.println(productoEncontrado);
    }
}
