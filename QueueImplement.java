public class QueueImplement {
    class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node current;

    public void push(int d) {
        if (head == null) {
            head = new Node(d);
            current = head;
        }else {
            Node node = new Node(d);
            current.next = node;
            current = node;
        }
    }

    public void pop() {
        if (head == null) {
            return;
        }else {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        QueueImplement QI = new QueueImplement();
        QI.push(1);
        QI.push(2);
        QI.push(3);
        QI.push(4);
        QI.pop();
        QI.pop();
        QI.pop();
        QI.pop();
        QI.pop();

    }
}