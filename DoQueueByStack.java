import java.util.Stack;


public class DoQueueByStack {
    Stack<Integer> StackIn = new Stack<>();
    Stack<Integer> StackOut = new Stack<>();

    private void add(int d) {
            StackIn.push(d);
    }

    private int pop() {
        if (StackIn.empty() && StackOut.empty()) {
            return -1;
        }else if (!StackOut.empty()) {
            return StackOut.pop();
        }else {
            while(!StackIn.empty()) {
                StackOut.push(StackIn.pop());
            }
            return StackOut.pop();
        }   
    }

    public static void main(String[] args) {
        DoQueueByStack DQBS = new DoQueueByStack();
        DQBS.add(0);
        DQBS.add(1);
        System.out.println(DQBS.pop());
        System.out.println(DQBS.pop());
        System.out.println(DQBS.pop());
        DQBS.add(2);
        DQBS.add(3);
        System.out.println(DQBS.pop());
        System.out.println(DQBS.pop());
        DQBS.add(4);
        System.out.println(DQBS.pop());
        System.out.println(DQBS.pop());
        System.out.println(DQBS.pop());
    }
}