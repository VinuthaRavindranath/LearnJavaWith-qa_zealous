package Collections.Deque;
//ArrayDeque Example: offerFirst() offerFirst() pollLast() pollFirst() peek() and peekLast()

import java.util.ArrayDeque;

public class Lesson1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        ad.offerLast(40);
        ad.offerLast(50);

        ad.offerFirst(1);
        ad.offerFirst(2);
        ad.offerFirst(3);
        ad.offerFirst(4);
        ad.offerFirst(5);

        ad.pollLast();
        ad.pollFirst();
        System.out.println(ad.peek());
        System.out.println(ad.peekLast());

        for (Integer q : ad) {
            System.out.print(q + " ");
        }
    }
}
