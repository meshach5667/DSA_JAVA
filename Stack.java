public class Stack {

    int size;
    int top;
    int[] array;

    public Stack(int capacity) {
        super();
        top = -1;
        size = capacity;
        array = new int[size];
      
    }

    boolean isFull(){
        return (top == size -1);

    }

    boolean isEmpty(){
        return (top ==1);
    }

    void push (int item){
       if (isFull()) {
       System.out.println("Stack Overflow");
       }

       else{
        array[top + 1 ] = item;
        top ++;
       }
 
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Returning -1 to indicate the stack is empty.
        } else {
            int item = array[top];
            top--;
            return item;
        }
    }
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack items: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
