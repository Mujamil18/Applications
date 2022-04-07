package collections;

import java.util.*;
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(pQueue);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        PriorityQueue<String> queue= new PriorityQueue<>();
        queue.add("Mujamil");
        queue.add("Shifa");
        queue.add("Mehala");
        queue.add("Harishmaa");
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.remove("Mujamil");
        System.out.println(queue);
    }
}
