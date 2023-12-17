import java.util.HashSet;
public class Questions {
    void deleteDups(LinkedList ll){
        HashSet<Integer> set = new HashSet<>();
        Node curr = ll.head;
        Node prev = null;
        while(curr!=null){
            int val = curr.data;
            if(set.contains(val)){
                prev.next = curr.next;
                ll.size--;
            }
            else{
                prev = curr;
                set.add(val);
            }
            curr = curr.next;
        }
    }
    Node removeNthFromLast(LinkedList ll,int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i = 0;i<n;i++){
            if(p2 == null)
                return null;
            p2 = p2.next;
        }
        while(p2!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
    }
}
