package stack;

public class MyStackDemo {

    public static void main(String[] args) {
        
        
        KdStack<String> kdStringStack = new KdStack<String>("new data");

        kdStringStack.push("Dixit");
        kdStringStack.push("Kedar");
        
        System.out.println(kdStringStack.peek());

        kdStringStack.pop();
        kdStringStack.pop();
        kdStringStack.pop();
        System.out.println(kdStringStack.peek());
        
        System.out.println(kdStringStack.isEmpty());
    }
}
