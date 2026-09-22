package co.edu.uniquindio.collection;

import java.util.ArrayDeque;

public class MainStack {

    static void main() {
        testStack();
    }

    public static void testStack(){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        IO.println(stack.pop());
        IO.println(stack.peek());
    }
}
