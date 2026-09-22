package co.edu.uniquindio.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MainQueue {

    static void main() {
        //testPriorityQueue();
        testLinkedList();
    }

    public static void testLinkedList(){
        LinkedList<String> cola = new LinkedList<>();
        // Queue
        cola.add("J");
        cola.add("H");
        cola.add("A");
        cola.add("N");

        IO.println(cola.peek());
        IO.println(cola.poll());
        IO.println(cola.poll());

    }

    public static void testPriorityQueue(){
        PriorityQueue<Integer> prioridad = new PriorityQueue<>();

        prioridad.add(5);
        prioridad.offer(1);
        prioridad.add(2);
        prioridad.add(4);
        prioridad.add(1);

        IO.println(prioridad.peek());
        IO.println(prioridad.size());

        IO.println(prioridad.poll());
        IO.println(prioridad.size());

        IO.println(prioridad.poll());
        IO.println(prioridad.peek());

        IO.println(prioridad.contains(1));

    }

}
