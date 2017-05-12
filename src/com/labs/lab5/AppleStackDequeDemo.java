package com.labs.lab5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Anna Kolesnikova on 12.05.2017.
 */
public class AppleStackDequeDemo {
    public static void main(String[] args) {
        System.out.println("#1");
        // #1 create and list deque elements
        Deque<Apple> deque = new ArrayDeque<>();
        deque.addFirst(new Apple("Red", 0.12));
        deque.addFirst(new Apple("Red", 0.05));
        deque.addFirst(new Apple("Red", 0.11));
        deque.addFirst(new Apple("Green", 0.11));
        deque.addLast(new Apple("Green", 0.15));

        listDequeElements(deque);

        // #2 sort descending
        Deque<Apple> sortedDeque = deque.stream().sorted(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return -1 * Double.compare(o1.getWeight(), o2.getWeight());
            }
        }).collect(Collectors.toCollection(ArrayDeque<Apple>::new));

        // #3 list sorted deque
        System.out.println("#2, #3");
        listDequeElements(sortedDeque);

        // #4 filter apple which weight is 0.05g
        System.out.println("#4");
        Deque<Apple> filteredDeque =
                deque.stream().filter(t -> t.getWeight() == 0.05)
                        .collect(Collectors.toCollection(ArrayDeque<Apple>::new));
        System.out.println("Filtered apple which weight is 0.05g");
        listDequeElements(filteredDeque);

        // #5, #6 filtered stack and list it
        System.out.println("#5, #6");
        System.out.println("Filtered red apples");
        Stack<Apple> filteredStack =
                deque.stream().filter(t -> t.getColor().equals("Red"))
                .collect(Collectors.toCollection(Stack<Apple>::new));
        listStackElements(filteredStack);

        // #7, 8
        System.out.println("#7, #8");
        Deque<Apple> sortedDequeAsc = deque.stream().sorted(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        }).collect(Collectors.toCollection(ArrayDeque<Apple>::new));

        Stack<Apple> sortedStackAsc = filteredStack.stream().sorted(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        }).collect(Collectors.toCollection(Stack<Apple>::new));

        listDequeElements(sortedDequeAsc);
        listStackElements(sortedStackAsc);

        // #9, 10
        System.out.println("#9, 10");
        List<Apple> joinedContainers = new ArrayList<>();
        Iterator<Apple> dequeIterator = deque.iterator();
        while (dequeIterator.hasNext()) {
            joinedContainers.add(dequeIterator.next());
        }
        Iterator<Apple> stackIterator = filteredStack.iterator();
        while (stackIterator.hasNext()) {
            joinedContainers.add(stackIterator.next());
        }
        System.out.println("Joined container:");
        for (Apple apple : joinedContainers) {
            System.out.print(apple.toString() + "  ");
        }
        System.out.println();

        // #11
        System.out.println("#11");
        long count = joinedContainers.stream().filter(t -> t.getColor().equals("Green")).count();
        System.out.println("The amount of green apples in the joined container is " + count);

        // #12
        System.out.println("#12");
        boolean hasRedApples = joinedContainers.stream().anyMatch(t -> t.getColor().equals("Red"));
        System.out.println("Joined container has red apples: " + hasRedApples);
    }

    private static void listDequeElements(Deque<Apple> deque) {
        System.out.println("Deque elements:");
        Iterator<Apple> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "   ");
        }
        System.out.println();
    }

    private static void listStackElements(Stack stack) {
        System.out.println("Stack elements:");
        Iterator<Apple> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "   ");
        }
        System.out.println();
    }
}
