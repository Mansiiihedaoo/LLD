import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {

    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);

        q.offerFirst(20);
        q.offerFirst(30);
        q.offerLast(40);
        System.out.println(q);
        // remove first
        System.out.println(" removing " + q.pollLast());
        System.out.println(q);

        System.out.println("peeking "+ q.peek());
        System.out.println(q);




    }
}
