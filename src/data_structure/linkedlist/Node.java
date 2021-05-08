package data_structure.linkedlist;

import data_structure.Item;

public class Node<T extends Item> {
    T item;
    Node next;

    Node(T item) {
        this.item = item;
    }

}
