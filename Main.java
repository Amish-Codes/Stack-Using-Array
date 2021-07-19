package Stack_Using_Array;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        boolean a = stack.isEmpty();
        boolean b = stack.isFull();
        System.out.println(a);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.isEmpty();
        System.out.println(b);
        System.out.println(a);
        stack.traverse();
        System.out.println();
        stack.peek();
        System.out.println();
        stack.pop();
        stack.traverse();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traverse();
        stack.delete();
        stack.traverse();
        
    }
}
