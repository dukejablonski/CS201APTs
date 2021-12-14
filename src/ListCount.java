import java.util.*;
public class ListCount {
    public int count (ListNode list) {
        if(list == null) return 0;
        return count(list.next) + 1;
    }
}