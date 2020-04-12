class MhsSinglyLinkedList
{
    private NodeMhs head;
    private NodeMhs tail;
    private int size;

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
            this.size += 1;
        }

        else if (ipk > this.head.ipk)
        {
            newNode.next = this.head;
            this.head = newNode;
            this.size += 1;
        }

        else if (ipk < this.tail.ipk)
        {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size += 1;
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
            this.size += 1;
        }
    }

    void deleteNode(String nim)
    {
        if (this.head == null)
        {
            return;
        }

        else if (this.head.nim.equals(nim))
        {
            this.head = this.head.next;
            this.size -= 1;
        }

        else if (this.tail.nim.equals(nim))
        {
            NodeMhs tempPrev = null;
            NodeMhs temp = this.head;

            while (temp != null)
            {
                tempPrev = temp;
                temp = temp.next;
            }

            tempPrev.next = null;
            this.size -= 1;
        }

        else
        {
            NodeMhs tempPrev = null;
            NodeMhs temp = this.head;

            while (temp != null)
            {
                if (temp.nim.equals(nim))
                {
                    tempPrev.next = temp.next;
                    temp.next = null;
                    this.size -= 1;
                }

                tempPrev = temp;
                temp = temp.next;
            }
        }
    }

    // print out all Node
    void print()
    {
        NodeMhs temp = this.head;

        while (temp != null)
        {
            System.out.println(temp.nim + "-" + temp.ipk + "-" + temp.nama);
            temp = temp.next;
        }
    }

    int size()
    {
        return this.size;
    }

    Object getNim(int index)
    {
        if (index > (this.size-1) || index < 0)
        {
            return null;
        }

        else 
        {
            NodeMhs temp = this.head;
            int tempInd = 0;

            while (tempInd < index)
            {
                temp = temp.next;
                tempInd += 1;
            }

            return temp.nim;
        }
    }

    Object getNama(int index)
    {
        if (index > (this.size-1) || index < 0)
        {
            return null;
        }

        else 
        {
            NodeMhs temp = this.head;
            int tempInd = 0;

            while (tempInd < index)
            {
                temp = temp.next;
                tempInd += 1;
            }

            return temp.nama;
        }
    }

    Object getIpk(int index)
    {
        if (index > (this.size-1) || index < 0)
        {
            return null;
        }

        else 
        {
            NodeMhs temp = this.head;
            int tempInd = 0;

            while (tempInd < index)
            {
                temp = temp.next;
                tempInd += 1;
            }

            return temp.ipk;
        }
    }
}

public class SLLMhs {
    public static void main(String[] args)
    {
        MhsSinglyLinkedList sll = new MhsSinglyLinkedList();

        double[] arrTest = {10.0,2.0,5.0,4.0,6.0,8.0,7.0,6.0,4.0,5.0,8.0,0.0,9.0,3.0,4.0,2.0,2.0,5.0,7.0,6.0,8.0,9.0,7.0,6.0,3.0};

        int i = 1;
        for (double nim : arrTest)
        {
            if (i < 10)
            {
                sll.insert("1910605000" +Integer.toString(i), "Test", nim);
                i += 1;
            }

            else
            {
                sll.insert("191060500" +Integer.toString(i), "Test", nim);
                i += 1;
            }
        }

        sll.print();
        System.out.println("Size: " +sll.size());
        System.out.println("\ngetNim(0): " + sll.getNim(0));
        System.out.println("getNama(0): " + sll.getNama(0));
        System.out.println("getIpk(0): " + sll.getIpk(0));

        System.out.println("\ngetNim(9): " + sll.getNim(9));
        System.out.println("getNama(9): " + sll.getNama(9));
        System.out.println("getIpk(9): " + sll.getIpk(9));

        System.out.println("\ngetNim(30): " + sll.getNim(30));
        System.out.println("getNama(30): " + sll.getNama(30));
        System.out.println("getIpk(30): " + sll.getIpk(30));


        System.out.println("\ngetNim(-6): " + sll.getNim(-6));
        System.out.println("getNama(-6): " + sll.getNama(-6));
        System.out.println("getIpk(-6): " + sll.getIpk(-6));

        System.out.println("deleteNode(\"19106050001\")");
        sll.deleteNode("19106050001");
        sll.print();
        System.out.println("Size: " +sll.size());;
    }
}