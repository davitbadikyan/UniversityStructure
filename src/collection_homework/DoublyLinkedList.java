package collection_homework;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    public class Node {
        protected Student student;
        protected Node next;
        protected Node prev;

        public Node() {
            next = null;
            prev = null;
            student = null;
        }

        public Node(Student student, Node next, Node prev) {
            this.student = student;
            this.next = next;
            this.prev = prev;
        }

        public void setLinkNext(Node next) {
            next = next;
        }

        public void setLinkPrev(Node prev) {
            prev = prev;
        }

        public Node getLinkNext() {
            return next;
        }

        public Node getLinkPrev() {
            return prev;
        }

        public void setData(Student student) {
            student = student;
        }

        public Student getData() {
            return student;
        }
    }

    protected Node start;
    protected Node end;
    public int size;

    public DoublyLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void push(Student student) {
        Node node = new Node(student, null, null);
        if (start == null) {
            start = node;
            end = start;
        } else {
            start.setLinkPrev(node);
            node.setLinkNext(start);
            start = node;
        }
        size++;
    }

    public void addLast(Student student) {
        Node node = new Node(student, null, null);
        if (start == null) {
            start = node;
            end = start;
        } else {
            node.setLinkPrev(end);
            end.setLinkNext(node);
            end = node;
        }
        size++;
    }

    public void print() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.student + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public Student pop() {
        if (size == 0) throw new NoSuchElementException();
        Node temp = start;
        start = start.next;
        if (start != null)
            start.prev = null;
        size--;
        System.out.println("deleted: " + temp.student);
        return temp.student;
    }

    public Student removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node temp = end;
        end = end.prev;
        if (end != null)
        end.next = null;
        size--;
        System.out.println("deleted: " + temp.student);
        return temp.student;
    }

}