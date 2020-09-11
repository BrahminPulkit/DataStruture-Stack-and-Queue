package Working_With_Stack;

// stack is linear data structure . it follow the concept of "LIFO"

public class Stack {
    public int data[];      // array declaration of field 'data'
    public int DEFAULT_SIZE = 10;       // size of Stack
    public int top =-1;

    public Stack()              // constructor
    {
        this.data = new int[DEFAULT_SIZE];
    }
    public boolean isFull() {           // check stack is full
        return top == data.length;
    }
    public boolean push(int ele){
        if (isFull()){
            return false;
        }
        data[++top] = ele;
        return true;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("kahli hai bee ");
        }
        return data[top--];
    }

    public int peak(){return data[top];}
    public int size(){return top+1;}

    public void display(){
        int i = 0;
        while (i<size()){
            System.out.println(data[i]);
            i++;
        }
    }
}
