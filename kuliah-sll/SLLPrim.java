class TLinkedList<T>
{
    private Node<T> head;
    private Node<T> tail;

    static class Node<T>
    {
        T data;
        Node<T> next;

        Node(T data)
        {
            this.data = data;
        }
    }

    // print all node starting from head node
    void printList()
    {
        if (this.head != null)
        {
            Node<T> temp = this.head;
            while (temp != null) {
                System.out.print(temp.data +", ");
                temp = temp.next;
            }
        }
    }

    // insert new data before head and use it as head
    void push(T tData)
    {
        Node<T> newNode = new Node<T>(tData);

        if (this.head == null)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        
        else
        {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    // insert new data as the last node
    void append(T tData)
    {
        Node<T> newNode = new Node<T>(tData);
        
        if (this.head == null)
        {
            this.head = newNode;
            this.tail = newNode;
        }

        else
        {
        this.tail.next = newNode;
        this.tail = newNode;
        }
    }

    void appendList(TLinkedList<T> sll)
    {
        if (sll == null)
        {
            return;
        }

        else
        {
            Node<T> temp = sll.head;

            while (temp != null)
            {
                append(temp.data);
                temp = temp.next;
            }
        }
    }

    // insert new data after a certain Node<T> data
    void insertAfter(T key, T newData)
    {
        Node<T> newNode = new Node<T>(newData);
        Node<T> temp = this.head;

        while (temp != null)
        {
            if (temp.data == key)
            {
                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            temp = temp.next;
        }
        
        System.out.println("Insert failed! There is no \"" +key +"\" in the Linked List");
    }

    // delete a certain Node<T> data
    void deleteNode(T key)
    {
        if (this.head.data == key)
        {
            this.head = this.head.next;

            return;
        }

        else
        {
            Node<T> temp = this.head;
            Node<T> tempPrev = this.head;
    
            while (temp != null)
            {
                tempPrev = temp;
                temp = temp.next;
    
                if (temp != null)
                {
                    if (temp.data == key)
                    {
                        tempPrev.next = temp.next;
        
                        return;
                    }
                }
            }

            System.out.println("Delete failed! There is no \"" +key +"\" in the Linked List");
        }
    }

    Node<T> getHead()
    {
        return this.head;
    }

    Node<T> getTail()
    {
        return this.tail;
    }
}

public class SLLPrim
{
    public static void main(String[] args)
    {
        System.out.println("SLL String:");

        TLinkedList<Object> lList = new TLinkedList<Object>();
        
        System.out.println("append():");
        lList.append("satu");
        lList.append("dua");
        lList.append("tiga");
        lList.printList();

        System.out.println("\npush():");
        lList.push("empat");
        lList.push("lima");
        lList.printList();

        System.out.println("\nappend():");
        lList.append("enam");
        lList.append("tujuh");
        lList.printList();

        System.out.println("\ninsertAfter():");
        lList.insertAfter("sembilanSembilanSembilan", "delapan");
        lList.insertAfter("empat", "delapan");
        lList.insertAfter("illuminati", "sembilan");
        lList.insertAfter("empat", "sembilan");
        lList.insertAfter("tujuh", "sepuluh");
        lList.printList();

        System.out.println("\ndeleteNode():");
        lList.deleteNode("lima");
        lList.deleteNode("tujuh");
        lList.deleteNode("illuminati");

        lList.printList();


        System.out.println("\n\n\nSLL Number:");
        
        TLinkedList<Object> lList2 = new TLinkedList<Object>();
        
        System.out.println("append():");
        lList2.append(1);
        lList2.append(2);
        lList2.append(3);
        lList2.printList();

        System.out.println("\npush():");
        lList2.push(4);
        lList2.push(5);
        lList2.printList();

        System.out.println("\nappend():");
        lList2.append(6);
        lList2.append(7);
        lList2.printList();

        System.out.println("\ninsertAfter():");
        lList2.insertAfter(999, 8);
        lList2.insertAfter(4, 8);
        lList2.insertAfter(666, 9);
        lList2.insertAfter(4, 9);
        lList2.insertAfter(7, 10);
        lList2.printList();

        System.out.println("\ndeleteNode():");
        lList2.deleteNode(5);
        lList2.deleteNode(7);
        lList2.deleteNode(666);

        lList2.printList();


        System.out.println("\n\n\nSLL Combined:");
        
        TLinkedList<Object> lListC = new TLinkedList<Object>();
        lListC.appendList(lList);
        lListC.appendList(lList2);

        lListC.printList();
    }
}