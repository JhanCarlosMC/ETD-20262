//package co.edu.uniquindio.iterables;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class InventarioIterator implements Iterator<String> {
//
//    private int cantidad;
//    private int indexActual= 0;
//
//    public InventarioIterator(int cantidad) {
//        this.cantidad = cantidad;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return indexActual < cantidad;
//    }
//
//    @Override
//    public String next() {
//        if(!hasNext()){
//          throw new NoSuchElementException();
//        }
//        return "";
//    }
//}
