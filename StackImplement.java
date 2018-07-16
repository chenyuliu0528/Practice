public class StackImplement{
    class Node{
        int data;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    Node current;
    Node head;

    public void push(int d) {
        if(head == null){
            head = new Node(d);
            current = head;
        }else {
            Node node = new Node(d);
            node.prev = current;
            current = node;
        }
    }

    public  void pop() {
        if(current == null){
            return;
        }else {
            System.out.println(current.data);
            current = current.prev; 
        }
    }
    public static void main(String args[]){
        StackImplement SI = new StackImplement();
        SI.push(3);
        SI.push(3);
        SI.push(4);
        SI.push(5);
        SI.push(7);
        SI.pop();
        SI.pop();
        SI.pop();
    }

}