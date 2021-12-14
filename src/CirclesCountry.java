public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {

        int cross = 0;
        for (int k = 0; k < x.length; k++) {
            if (in(r[k], x1, y1, x[k], y[k]) ^ in(r[k], x2, y2, x[k], y[k])) {
                cross += 1;
            }
        }
        return cross;
    }
    private boolean in(int radius, int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((y1 - y2), 2) + Math.pow((x1 - x2), 2));
        return distance < radius;
    }
}


