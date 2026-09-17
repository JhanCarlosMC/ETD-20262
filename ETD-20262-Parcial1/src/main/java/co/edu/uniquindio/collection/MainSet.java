package co.edu.uniquindio.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MainSet {
    static void main() {
        //testHashSet();
        testLinkedHashSet();
    }

    public static void testHashSet(){
        HashSet<Integer> setNum = new HashSet<>();

        setNum.add(5);
        setNum.add(10);
        setNum.add(23);
        setNum.add(100);
        setNum.add(40);

        boolean esta = setNum.contains(100);
        IO.println(esta);

        IO.println(setNum.size());

        IO.println(setNum.remove(10));
        IO.println(setNum.size());

    }
    public static void testLinkedHashSet() {
        LinkedHashSet<String> linkedSetPalabras = new LinkedHashSet<>();

        linkedSetPalabras.addLast("Computador");
        linkedSetPalabras.addFirst("Memoria");
        linkedSetPalabras.add("SSD");
        linkedSetPalabras.add("Monitor");

        IO.println(linkedSetPalabras.contains("SSD"));
        IO.println(linkedSetPalabras.size());

        Iterator<String> setIterator = linkedSetPalabras.iterator();

        IO.println("Iterdor con Set");
        while (setIterator.hasNext()){
            IO.println(setIterator.next());
        }
    }
}
