package competative.practice.Queues;

public class ArrayQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // constructor
        Queue(int nsize){
            arr = new int[nsize];
            this.size = nsize;
        }

        // is Empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
            }
            rear++;
            arr[rear]= data;
        }

        //Deque : int bcz with elemen remove it also return tha element
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];

            for(int i=0; i < rear; i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }

        // Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }


    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        //1 2 3
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
