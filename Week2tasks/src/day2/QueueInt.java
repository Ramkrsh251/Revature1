package day2;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
public class QueueInt{
	public static void main(String[] args) {

        int len = 5;
        Random random = new Random();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Random number generated:");
        for (int i = 0; i < len; i++) {
            Integer randomNumber = new Integer(random.nextInt(100));
            linkedList.add(randomNumber);
            priorityQueue.add(randomNumber);
            System.out.println(i + ": " + randomNumber);
        }
        linkedList.add(0);
        priorityQueue.add(0);
        System.out.println("Number in linkedList:");
        for (int i = 0; i <=len; i++) {
            Integer item = linkedList.poll();
            System.out.println(i + ": " + item);
        }
        System.out.println("Number in priorityQueue:");
        for (int i = 0; i <=len; i++) {
            Integer item = priorityQueue.poll();
            System.out.println(i + ": " + item);
        }
    }
	
}