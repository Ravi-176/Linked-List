public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public void createLL(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }
    public void insertNode(int value){
        if(head == null){
            createLL(value);
            return;
        }
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void traversalLL(){
        Node temp = head;
        for(int i = 0;i<size;i++){
            System.out.print(temp.data);
            if(i!=size-1)
                System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }
}
