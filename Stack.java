package Stack_Using_Array;

public class Stack {

    int[] arr;
    int top;

    public Stack(int size) {
        this.arr = new int[size];  // O(1)
        this.top=-1;  // O(1)
        System.out.println("The Stack is created with size of: " + size);  // O(1)
        // Space Complexity of the Stack is O(N) it means that it is going to allocate continuous a number of cells in the memory 
    }

    // checking whether a stack is empty or not
    public boolean isEmpty() {
        if (top==-1) {   // O(1)
            return true;  // O(1)
        }
        else {
            return false;  // O(1)
        }
    // Space Complexity is also O(1) because we have not performed an operation i.e. Space Consuming
    }
    
    // checking whether a stack is full or not
    public boolean isFull() {
        if(top==arr.length-1) {
            return true;  // O(1)
        }
        else {
            return false;  // O(1)
        }
    // Space Complexity is also O(1) because in this case extra memory is not required to perform this operation
    }

    // pushing elements in the stack
    public void push(int value) {
        if (isFull()) {   // O(1)
            System.out.println("Stack is full...");  // O(1)
        }
        else {
            arr[top+1]=value;  // O(1)
            top++;  // O(1)
            System.out.println("The value is successfully inserted!");  // O(1)
        }
    // Space Complexity is O(1) because we are just updating array
    }

    // traversig stack
    public void traverse() {
        if (isEmpty()) {  // O(1)
            System.out.println("Stack is empty...");  // O(1)
        }
        else {
            for(int i=top;i>=0;i--) {  // O(N)
                System.out.println(arr[i]);  // O(1)
            }
        }
    }

    // popping element from stack
    public int pop() {
        if (isEmpty()) {  // O(1)
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            // int x = arr[top];  // O(1)
            top--;  // O(1)
            return top;  // O(1)
        }
    // Space Complexity is also O(1) because we are deleting just one element from stack
    }

    // viewing top element
    public void peek() {
        if (isEmpty()) {  // O(1)
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(arr[top]);  // O(1)
        }
    // Space Complextiy is also O(1) because an extra memory is not required to perfrom peek operation
    }
    
    // deleting stack
    public void delete() {
        arr = null;  // O(1)
        System.out.println("The stack is successfully deleted");  // O(1)
    // Space Complexity is also O(1)
    }
}