package hum.set;

import hum.linkedlist.LinkedList;

/**
 * @author hum
 */
public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<E>();
    }

    public void add(E e) {
        if (!list.contains(e)) {
            list.addFirst(e);
        }
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public void remove(E e) {
        list.removeElement(e);
    }

    public int getSize() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
