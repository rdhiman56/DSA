package competative.practice.Queues;
import java.util.*;

public class javaCollectionFramework {
    public static void main(String[] args) {
        //Queue q = new Queue(5);

        // Linked list is a class
        // Queue : is a interface
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
