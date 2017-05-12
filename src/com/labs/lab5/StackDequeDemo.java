package com.labs.lab5;

import java.util.*;

/**
 * Created by Anna Kolesnikova on 12.05.2017.
 */
public class StackDequeDemo {
    public static void main(String[] args) {
        Random random = new Random();
        // #1 create Deque container and fill it with random data
        Deque<Float> deque = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            deque.add(random.nextFloat());
        }

        // #2 list Deque elements
        System.out.println("#1, #2");
        listDequeElements(deque);
        listDequeElementsReversed(deque);

        // #3 Remove and add Deque elements
        deque.removeFirst();
        deque.removeLast();
        deque.removeLast();
        deque.addFirst(random.nextFloat());
        deque.addLast(random.nextFloat());

        // #4 list Deque elements with iterators
        System.out.println("#3, #4");
        listDequeElements(deque);
        listDequeElementsReversed(deque);

        // #5 create Stack container and fill it with random data
        Stack<Float> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(random.nextFloat());
        }

        // #6 remove some elements from deque and add all elements from stack to deque
        deque = deleteFromDeque(deque, 3, 4);
        Iterator<Float> iterator = stack.iterator();
        while (iterator.hasNext()) {
            deque.addFirst(iterator.next());
        }

        // # 7 list deque and stack elements
        System.out.println("#5, #6, #7");
        listDequeElements(deque);
        listStackElements(stack);
    }

    private static void listDequeElements(Deque<Float> deque) {
        System.out.println("Deque elements:");
        Iterator<Float> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();
    }

    private static void listDequeElementsReversed(Deque<Float> deque) {
        System.out.println("Deque elements reversed:");
        Iterator<Float> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();
    }

    private static Deque<Float> deleteFromDeque(Deque<Float> deque, int startIndex, int count) {
        Iterator<Float> iterator = deque.iterator();
        int idx = 1;
        while (iterator.hasNext()) {
            iterator.next();
            if (idx >= startIndex && idx < idx + count) {
                iterator.remove();
            }
            idx++;
        }
        return deque;
    }

    private static void listStackElements(Stack stack) {
        System.out.println("Stack elements:");
        Iterator<Float> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();
    }

}
