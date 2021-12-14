public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] split = str.split(" ");

        int[] a = new int[words.length];

        for (int k = 0; k < words.length; k++) {
            String b = words[k];
            for (String c : split) {
                if (b.equals(c)) {
                    a[k]++;
                }
            }
        }
        return a;
    }
}