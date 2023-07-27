package algo01._01linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }



    //create a new node
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //create new node
    //appned new node to the tail
    public void append (int value){

    }

    //create a new node
    //add that new node to the beginning
    public void prepand(int value){

    }

    //create a new node
    //add that new node to the given index
    public boolean insert(int index, int vaue){
        return false;
    }

    public void printList(){
        Node temp = head;
        while (head != null){
           System.out.println(temp.value);
           temp = temp.next;
        }
    }
}
