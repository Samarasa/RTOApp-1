package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DescendableLinkedList<E> extends LinkedList<E> {

    private class a<E> implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        private final ListIterator<E> f15383a;

        private a(int i) {
            this.f15383a = DescendableLinkedList.this.listIterator(i);
        }

        public boolean hasNext() {
            return this.f15383a.hasPrevious();
        }

        public E next() {
            return this.f15383a.previous();
        }

        public void remove() {
            this.f15383a.remove();
        }
    }

    public Iterator<E> descendingIterator() {
        return new a(size());
    }

    public E peekLast() {
        if (size() == 0) {
            return null;
        }
        return getLast();
    }

    public E pollLast() {
        if (size() == 0) {
            return null;
        }
        return removeLast();
    }

    public void push(E e2) {
        addFirst(e2);
    }
}
