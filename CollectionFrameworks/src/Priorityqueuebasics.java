import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueuebasics {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(100);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        // remove
        System.out.println(" removing " + q.poll());
        System.out.println(q);

        System.out.println("peeking "+ q.peek());
        System.out.println(q);




    }
}
