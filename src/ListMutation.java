import java.util.ArrayList;
import java.util.*;

public class ListMutation {
    public ListNode alter(ListNode list){
        ArrayList<Integer> n = new ArrayList<>();
        while (list!= null){
            if(list.info%2 == 0){
                n.add(list.info);
                n.add(list.info);
            }
            list = list.next;
        }

        if(n.size()==0){
            return null;
        }
        ListNode ans = new ListNode(n.get(0), null);


        for(int j=1;j<n.size();j++){
            ListNode node = new ListNode(n.get(j), null);
            ListNode t = ans;
            while(t.next!=null){
                t = t.next;
            }
            t.next = node;
        }
        return ans;
    }
}
