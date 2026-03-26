package DataStructure.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};

public class LinkedList {

    // Convert Array to Linkedlist
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node y = new Node(arr[3]);
        System.out.println(y.data);

        //convertArr2LL
        Node head = convertArr2LL(arr);
        System.out.println("Head is : " + head.data);

        // Length od LL
        System.out.println("Length of LL : " + lengthOfLL(head));

        //Traversal LL
        System.out.print("Traversal LL : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }
}
