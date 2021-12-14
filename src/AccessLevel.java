public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String k = "";
        for (int l = 0; l < rights.length; l++) {
            if (minPermission <= rights[l]) {
                k += "A";
            }
            else {
                k += "D";
            }
        }
        return k;
    }
}







