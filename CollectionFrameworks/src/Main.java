import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list );
        // addall
        ArrayList<Integer> list2 = new ArrayList<>();
        // add
        list2.add(101);
        list2.add(201);
        list2.add(301);

        list.addAll(list2); // el of l2 to l1
        System.out.println(list);

        //removeAll
        list.removeAll(list2);
        System.out.println(list);
        // size
        System.out.println(list.size());

        // clear remove all el
        list2.clear();
        System.out.println(list2);

        // traverse using iterator()
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("element :" + it.next());
        }
// list 3
        ArrayList<Integer> list3 = new ArrayList<>();
        // add
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(2));

        //set()
        System.out.println("Before " + list3);
        list3.set(2,15);
        System.out.println("After" + list3);

        //toArray
        Object[] arr = list3.toArray();
        for(Object obj :arr){
            System.out.println(obj);
        }

        //contain t ya f
        System.out.println(list3.contains(122));

        // all above methods works for Linked list tooo

        LinkedList<Integer> llist = new LinkedList<>();
        // add
        llist.add(6);
        llist.add(12);
        llist.add(30);
        // addFirst addLast
        System.out.println(llist);
        llist.addFirst(1);
        llist.addLast((100));
        System.out.println(llist);

        System.out.println("Before :" + llist);
        System.out.println("Peek el : " +llist.peek());
        System.out.println("After : "+llist);

        System.out.println("Before :" + llist);
        System.out.println("Poll el : " +llist.poll()); // returns and remove
        System.out.println(llist);

        System.out.println("Before :" + llist);
        System.out.println("Offer el : " +llist.offer(102));
        System.out.println(llist);

        // same all methods for vectors
        Vector<Integer> v = new Vector<>();

        // same all methods for stacks
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(11);
        st.push(12);
        st.push(13);

        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push(15);
        st.peek();
        System.out.println(st.peek());
        System.out.println(st.search(20));
        System.out.println(st.empty());











    }
}