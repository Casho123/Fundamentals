package Advanced.IteratorsAndComparators.StackIterator;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class CustomStack implements Iterable<Integer> {

    private Node top;

    private class Node {
        private int element;
        private Node prev;

        public Node(int element) {
            this.element = element;
        }
    }

    public void push(int element) {
        Node newNode = new Node(element);
        if (this.top != null) {
            newNode.prev = this.top;
        }
        this.top = newNode;
    }

    public int pop() {
        if (this.top == null) {
            throw new IllegalStateException("No Elements");
        }
        int poppedElement = this.top.element;
        this.top = this.top.prev;
        return poppedElement;
    }
    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node currentNode = top;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Integer next() {
                int element = currentNode.element;
                currentNode = currentNode.prev;
                return element;
            }
        };
    }




}
