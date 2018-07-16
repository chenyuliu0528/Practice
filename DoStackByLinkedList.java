import java.util.LinkedList;;

public class DoStackByLinkedList {

    LinkedList<Integer> queue = new LinkedList<>();

    private void push(int i) {
        queue.add(i);
    }

    private int pop(){
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.removeLast();
        }
    }

    public static void main(String[] args) {
        DoStackByLinkedList DSBL = new DoStackByLinkedList();

        DSBL.push(1);
        DSBL.push(2);
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
        DSBL.push(3);
        DSBL.push(4);
        DSBL.push(5);
        DSBL.push(6);
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
        DSBL.push(7);
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
        System.out.println(DSBL.pop());
    }

}