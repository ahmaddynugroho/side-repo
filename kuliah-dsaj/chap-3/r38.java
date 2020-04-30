import java.util.Random;

public class r38 {
    Node head;

    static class Node{
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addRand(int n) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        Node temp = new Node(rand.nextInt(100));
        this.head = temp;
        Node prev = this.head;
        
        for (int i = 0; i < n; i++) {
            temp = new Node(rand.nextInt(100));
            prev.next = temp;
            prev = temp;
        }
    }

    public void print() {
        Node temp = this.head;

        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }

    public int middleData() {
        Node temp = this.head;
        Node tempHalf = this.head;

        while (temp.next != null) {
            temp = temp.next;
            if (temp.next != null) {
                temp = temp.next;

                tempHalf = tempHalf.next;
            }
        }

        return tempHalf.data;
    }

    public static void main(String[] args) {
        r38 run = new r38();

        run.addRand(5);
        run.print();
        System.out.println("\n" +run.middleData());
    }
}