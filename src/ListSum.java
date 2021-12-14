public class ListSum {
    public int sum(ListNode list, int thresh) {

        if (list == null) return 0;
        int sum = 0;
        if (list.info <= thresh) {
            sum = sum(list.next, thresh);
        }
        if (list.info > thresh) {
            sum = list.info + sum(list.next,thresh);
        }
        return sum;
    }
}
