class Node3 {
    int value;
    Node3 nextNode;

    Node3(int v, Node3 n) {
        value = v;
        nextNode = n;
    }

    Node3(int v) {
        this(v, null);
    }

}
class LinkedList {
    Node3 head;
    LinkedList() {

    }
    int length() {
        Node3 tempPtr;
        int result = 0;
        tempPtr = head;

        while (tempPtr != null) {
            tempPtr = tempPtr.nextNode;
            result = result + 1;
        }
        return(result);
}
    void insertAt(int v, int position) {
        Node3 newNode = new Node3(v, null);
        Node3 tempPtr;
        int tempPosition = 0;
        if((head == null) || (position == 0)) {
            newNode.nextNode = head;
            head = newNode;
        }
        else {
            tempPtr = head;
            while((tempPtr.nextNode != null) && (tempPosition < position - 1)) {
                tempPtr = tempPtr.nextNode;
                tempPosition = tempPosition + 1;
            }
            if (tempPosition == (position - 1)) {
                newNode.nextNode = tempPtr.nextNode;
                tempPtr.nextNode = newNode;
            }
        }

    }

    public String toString() {
        Node3 tempPtr;
        tempPtr = head;
        String result = "";

        while(tempPtr != null) {
            result = result + "[" + tempPtr.value + ", ] -->";
            tempPtr = tempPtr.nextNode;
        }
        result = result + "null";
        return result;
    }
}
public class LinkedListDemoInsDel {
    public static void main(String[] args) {
        LinkedList aLinkedList = new LinkedList();
        aLinkedList.insertAt(1, 0);
        aLinkedList.insertAt(9, 1);
        aLinkedList.insertAt(13, 2);
        aLinkedList.insertAt(8,1);
        aLinkedList.insertAt(3, 2);
        System.out.println(aLinkedList);
        System.out.println("Largo de Lista: " + aLinkedList.length());
    }
}
