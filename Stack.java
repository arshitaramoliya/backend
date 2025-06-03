/**
 * Stack — LIFO data structure using array
 * Operations: push, pop, peek — all O(1)
 */
public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow — cannot push " + value);
            return;
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return data[top];
    }

    public boolean isEmpty() { return top == -1; }
    public boolean isFull()  { return top == capacity - 1; }
    public int size()        { return top + 1; }

    public void display() {
        if (isEmpty()) { System.out.println("Stack: []"); return; }
        System.out.print("Stack (top→bottom): ");
        for (int i = top; i >= 0; i--) System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10); s.push(20); s.push(30);
        s.display();
        System.out.println("Peek: " + s.peek());
        System.out.println("Pop:  " + s.pop());
        s.display();
    }
}
