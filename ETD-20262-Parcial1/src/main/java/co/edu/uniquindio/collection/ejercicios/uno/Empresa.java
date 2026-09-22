package co.edu.uniquindio.collection.ejercicios.uno;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> inventario;

    public Empresa (){
        inventario = new TreeSet<>();
    }
    public int cantidad(){
       return inventario.size();
    }

    public boolean agregarProducto(Producto nuevoProducto){
       return inventario.add(nuevoProducto);
    }

    public Producto buscarProducto(String codigoProducto){
        for(Producto producto: inventario){
            if(producto.getCodigo().equals(codigoProducto)){
                return producto;
            }
        }
        return null;
    }
}
