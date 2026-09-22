package co.edu.uniquindio.collection;

import java.util.*;

public class MainMap {

    static void main() {
        //testHashMap();
        //testLinkedHasMap();
        testTreeMap();
    }

    public static void testTreeMap(){
        TreeMap<Integer, String> miMapa = new TreeMap<>();

        miMapa.put(15, "JhanCarlos");
        miMapa.put(13, "Maria");
        miMapa.put(17, "Pedro");
        miMapa.put(28, "Dayana");

        IO.println(miMapa.get(17));
        IO.println(miMapa.get(15));

        IO.println(miMapa.containsKey(28));
        IO.println(miMapa.containsValue("JhanCarlos"));

        IO.println(miMapa.values());

        IO.println("For each de las entries");
        for(Map.Entry<Integer,String> entrada: miMapa.entrySet()){
            IO.println(entrada + " - " + entrada.getKey() + " - " + entrada.getValue());
        }
    }

    public static void testLinkedHasMap(){
        LinkedHashMap<Integer, String> miMapa = new LinkedHashMap<>();

        miMapa.put(15, "JhanCarlos");
        miMapa.put(13, "Maria");
        miMapa.put(17, "Pedro");
        miMapa.put(28, "Dayana");

        IO.println(miMapa.get(17));
        IO.println(miMapa.get(15));

        miMapa.putFirst(100, "Mario");
        miMapa.putLast(00, "Sara");

        IO.println(miMapa.containsKey(28));
        IO.println(miMapa.containsValue("JhanCarlos"));

        IO.println(miMapa.values());
        Collection<String> valores = miMapa.values();

        Set<Integer> keys = miMapa.keySet();
        Iterator<Integer> setIterator = keys.iterator();

        IO.println("Iterdor con Set de las keys");
        while (setIterator.hasNext()){
            IO.println(setIterator.next());
        }

        IO.println("For each de las entries");
        for(Map.Entry<Integer,String> entrada: miMapa.entrySet()){
            IO.println(entrada + " - " + entrada.getKey() + " - " + entrada.getValue());
        }
    }


    public static void testHashMap(){
        HashMap<Integer, String> miMapa = new HashMap<>();

        miMapa.put(15, "JhanCarlos");
        miMapa.put(13, "Maria");
        miMapa.put(17, "Pedro");
        miMapa.put(28, "Dayana");

        IO.println(miMapa.get(17));
        IO.println(miMapa.get(15));

        IO.println(miMapa.containsKey(28));
        IO.println(miMapa.containsValue("JhanCarlos"));

        IO.println(miMapa.values());
        Collection<String> valores = miMapa.values();

        Set<Integer> keys = miMapa.keySet();
        Iterator<Integer> setIterator = keys.iterator();

        IO.println("Iterdor con Set de las keys");
        while (setIterator.hasNext()){
            IO.println(setIterator.next());
        }

        IO.println("For each de las entries");
        for(Map.Entry<Integer,String> entrada: miMapa.entrySet()){
            IO.println(entrada + " - " + entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
