public class Totality {
    public int sum(int[] a, String stype) {
        int even = 0;
        int odd = 0;
        for (int j = 0; j < a.length; j++) {
            if (j % 2 == 0) {
                even += a[j];
            }
            else {
                odd += a[j];
            }
        }
        if (stype.equals("all")) {
            return even + odd;
        }
        else if (stype.equals("odd")) {
            return odd;
        }
        else {
            return even;
        }
    }
}




