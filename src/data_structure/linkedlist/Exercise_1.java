package data_structure.linkedlist;

import data_structure.Student;

public class StudentLinkedList {

    public static void main(String[] args) {

        Student studentA = new Student(1, "Jack");
        Student studentB = new Student(2,"Jill");
        Student studentC = new Student(3,"John");

        Node nodeA = new Node(studentA);
        Node nodeB = new Node(studentB);
        Node nodeC = new Node(studentC);
        nodeA.next = nodeB;
        nodeB.next = nodeC;

        int numOfNodes = countNodes(nodeA);
        System.out.println("Num of Nodes " + numOfNodes);

        printNames(nodeA);

    }

    public static int countNodes(Node head) {
        // assuming head is not null
        int count = 1;

        Node current = head;

        while(current.next != null) {
            count++;
            current = current.next;
        }

        return count;

    }

    public static void printNames(Node head) {

        // assuming head is not null

        Node current = head;

        while (current.next != null) {
            System.out.println("Name : " + current.item.getName());
            current = current.next;
        }

        // Tail
        if (current.next == null) {
            System.out.println("Tail : " + current.item.getName());
        }

    }
}
