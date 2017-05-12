package com.labs.lab2;

import java.util.Iterator;

/**
 * Created on 26.03.2017.
 */
public class Deque<Item> implements Iterable<Item> {
    private class Node<Item> {
        public Item item;
        public Node<Item> next;
        public Node<Item> prev;

        public Node() {
        }

        public Node(Item item) {
            this.item = item;
        }
    }

    private class DequeIterator implements Iterator<Item> {
        private Node<Item> current;

        public DequeIterator(Node<Item> node) {
            current = node;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Node<Item> first;
    private Node<Item> last;
    private int size;

    public Deque() {
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new java.lang.NullPointerException();
        }

        Node<Item> newNode = new Node<Item>(item);
        size++;

        if (isEmpty()) {
            first = newNode;
            last = first;
            return;
        }

        if (last.prev == null) {
            last.prev = first;
        }

        first.prev = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new java.lang.NullPointerException();
        }

        Node<Item> newNode = new Node<Item>(item);
        size++;

        if (isEmpty()) {
            last = newNode;
            first = last;
            return;
        }

        newNode.prev = last;
        last.next = newNode;
        last = last.next;
    }

    public Item removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }

        Item deleted = first.item;
        size--;
        if (first.next == null) {
            first = null;
            last = first;
        } else {
            first = first.next;
        }

        return deleted;
    }

    public Item removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }

        Item deleted = last.item;
        size--;
        if (last.prev == null) {
            last = null;
            first = last;
        } else {
            last = last.prev;
        }

        return deleted;
    }

    public Iterator<Item> iterator() {
        return new DequeIterator(first);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this){
            s.append(item + " ");
        }

        return s.toString();
    }
}
