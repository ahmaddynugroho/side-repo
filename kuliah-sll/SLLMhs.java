class MhsSinglyLinkedList
{
    NodeMhs head;
    NodeMhs tail;

    static class NodeMhs
    {
        String nim, nama;
        double ipk;
        NodeMhs next;

        NodeMhs(String nim, String nama, double ipk)
        {
            this.nim = nim;
            this.nama = nama;
            this.ipk = ipk;
        }
    }

    // inserting Mhs data as a sorted list according to ipk
    void insert(String nim, String nama, double ipk)
    {
        NodeMhs newNode = new NodeMhs(nim, nama, ipk);

        if (this.head == null)
        {
            this.head = newNode;
            this.tail = newNode;
        }

        else if (ipk > this.head.ipk)
        {
            newNode.next = this.head;
            this.head = newNode;
        }

        else if (ipk < this.tail.ipk)
        {
            this.tail.next = newNode;
        }

        else
        {
            NodeMhs tempPrev = this.head;
            NodeMhs temp = this.head;

            while ((temp.next != null) && (ipk < temp.ipk))
            {
                tempPrev = temp;
                temp = temp.next;
            }

            newNode.next = tempPrev.next;
            tempPrev.next = newNode;
        }
    }

    // print out all Node
    void print()
    {
        NodeMhs temp = this.head;

        while (temp.next != null)
        {
            System.out.println(temp.nim + "-" + temp.ipk + "-" + temp.nama);
            temp = temp.next;
        }

        System.out.println(temp.nim + "-" + temp.ipk + "-" + temp.nama);
    }
}

public class SLLMhs {
    public static void main(String[] args)
    {
        MhsSinglyLinkedList sll = new MhsSinglyLinkedList();

        double[] arrTest = {1.0,2.0,5.0,4.0,6.0,8.0,7.0,6.0,4.0,5.0,8.0,0.0,9.0,3.0,4.0,2.0,2.0,5.0,7.0,6.0,8.0,9.0,7.0,6.0,3.0};

        for (double nim : arrTest)
        {
            sll.insert("19106050001", "Test", nim);
        }

        sll.print();
    }
}