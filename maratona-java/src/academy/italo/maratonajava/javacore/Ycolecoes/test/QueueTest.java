package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        System.out.println("=== Regular Queue (FIFO) ===");
        Queue<String> regularQueue = new LinkedList<>();
        regularQueue.add("First");
        regularQueue.add("Second");
        regularQueue.add("Third");

        while (!regularQueue.isEmpty()) {
            System.out.println("Processing: " + regularQueue.poll());
        }

        System.out.println("\n=== Priority Queue ===");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("C");
        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("D");

        while (!priorityQueue.isEmpty()) {
            System.out.println("Processing: " + priorityQueue.poll());
        }

        System.out.println("\n=== Custom Priority Queue ===");
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>((a, b) -> b - a);
        customPriorityQueue.add(5);
        customPriorityQueue.add(1);
        customPriorityQueue.add(10);
        customPriorityQueue.add(3);

        while (!customPriorityQueue.isEmpty()) {
            System.out.println("Processing: " + customPriorityQueue.poll());
        }

        String[] teste = {"eat","tea","tan","ate","nat","bat"};

        for(int i = 0; i < teste.length; i++){
            String[] wordSplit = teste[i].split("");
            Arrays.sort(wordSplit);
            teste[i] = String.join("",wordSplit);
        }

        System.out.println(Arrays.toString(teste));
    }
}