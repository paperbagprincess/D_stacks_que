public class stack {

     int top;
        int size;
        //int capacity;
        int[] array;

        stack(int capacity){
            top = -1;
            size = capacity;
            array = new int[size];
        }

        boolean isFull(){
            return (top == size-1);
        }

        boolean isEmpty(){
            return (top == -1);
        }

        void push(int item){
            if(isFull()){
                System.out.println("stack overflow");
            }else{
                array[top + 1] = item;
                top++;
            }
        }
        void pop(int item){
            if(isEmpty()){
                System.out.println("under overflow");
            }else{
                array[top -1] = item;
                top--;

            }
        }
        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
    
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        

    public static void main(String[] args) {
       
    }
}
