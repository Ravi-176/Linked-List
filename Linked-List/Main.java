public class Main {
    public static void main(String args[]){
        LinkedList obj = new LinkedList();
        obj.createLL(1);
        obj.insertNode(2);
        obj.insertNode(2);
        obj.insertNode(4);
        obj.insertNode(5);
        obj.traversalLL();
        Questions q = new Questions();
        //q.deleteDups(obj);
        obj.traversalLL();
        Node ans = q.removeNthFromLast(obj,2);
        System.out.println(ans.data);
      }
}
