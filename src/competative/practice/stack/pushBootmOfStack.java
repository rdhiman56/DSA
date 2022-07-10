package competative.practice.stack;
import java.util.*;


public class pushBootmOfStack {
      public static void pushAtBottom(int data, Stack<Integer> s) {
          if(s.isEmpty()){
              s.push(data);
              return;
          }

          int num = s.pop();
          pushAtBottom(data, s);
          s.push(num);
      }

    // Stack java framework
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottom(5, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
