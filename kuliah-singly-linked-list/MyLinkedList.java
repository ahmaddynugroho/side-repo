class Node
{
    private int data;
    private Node next;
    
    Node(int intData)
    {
        this.data = intData;
    }

    void setNext(Node nextNode)
    {
        this.next = nextNode;
    }

    int getData()
    {
        return this.data;
    }

    Node getNext()
    {
        return this.next;
    }
}

class IntLinkedList
{
    private Node head;

    // print all node starting from head node
    void printList()
    {
        if (this.head != null)
        {
            Node temp = this.head;
            while (temp.getNext() != null) {
                System.out.print(temp.getData() +", ");
                temp = temp.getNext();
            }

            System.out.println(temp.getData());
        }
    }

    // insert new data before head and use it as head
    void push(int intData)
    {
        Node newNode = new Node(intData);

        if (this.head == null)
        {
            this.head = newNode;
        }
        
        else
        {
            newNode.setNext(head);
            this.head = newNode;
        }
    }

    // insert new data as the last node
    void append(int intData)
    {
        Node newNode = new Node(intData);
        Node temp = this.head;

        if (this.head == null)
        {
            this.head = newNode;
        }
        
        else
        {
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }
    
            temp.setNext(newNode);    
        }
    }

    // insert new data after a certain node data
    void insertAfter(int key, int newData)
    {
        Node newNode = new Node(newData);
        Node temp = this.head;

        while (temp.getNext() != null)
        {
            if (temp.getData() == key)
            {
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);

                return;
            }

            temp = temp.getNext();
        }
        
        if (temp.getData() == key)      
        {
            temp.setNext(newNode);
        }
        
        else
        {
            System.out.println("Insert failed! There is no \"" +key +"\" in the Linked List");
        }
    }

    // delete a certain node data
    void deleteNode(int key)
    {
        Node temp = this.head;
        Node tempPrev = null;

        if (this.head.getData() == key)
        {
            this.head = this.head.getNext();

            return;
        }

        else
        {
            while (temp.getNext() != null)
            {
                tempPrev = temp;
                temp = temp.getNext();
    
                if (temp.getData() == key)
                {
                    tempPrev.setNext(temp.getNext());
    
                    return;
                }
            }
    
            if (temp.getData() == key)
            {
                tempPrev.setNext(null);
            }
    
            else
            {
                System.out.println("Delete failed! There is no \"" +key +"\" in the Linked List");
            }
        }
    }

    Node getHead()
    {
        return this.head;
    }
}

public class MyLinkedList
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
                
        System.out.println("Singly Linked List v0.1 by Ahmad D. Y. Nugroho\n\n
                            Select menu:\n
                            1. ");

        // IntLinkedList lList = new IntLinkedList();
        
        // System.out.println("append():");
        // lList.append(1);
        // lList.append(2);
        // lList.append(3);
        // lList.printList();

        // System.out.println("\npush():");
        // lList.push(4);
        // lList.push(5);
        // lList.printList();

        // System.out.println("\nappend():");
        // lList.append(6);
        // lList.append(7);
        // lList.printList();

        // System.out.println("\ninsertAfter():");
        // lList.insertAfter(999, 8);
        // lList.insertAfter(4, 8);
        // lList.insertAfter(666, 9);
        // lList.insertAfter(4, 9);
        // lList.insertAfter(7, 10);
        // lList.printList();

        // System.out.println("\ndeleteNode():");
        // lList.deleteNode(5);
        // lList.deleteNode(7);
        // lList.deleteNode(666);

        // lList.printList();
    }
}