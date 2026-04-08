import java.util.*;

class StackDemo {
    Stack<Integer> stack = new Stack<>();

    void pushElement(int x) {
        stack.push(x);
        System.out.println("Pushed: " + x);
    }

    void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty");
        }
    }

    void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StackDemo s = new StackDemo();

        s.pushElement(10);
        s.pushElement(20);

        s.popElement();

        s.checkEmpty();
    }
}
