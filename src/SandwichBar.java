import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {

        List<String> a = new ArrayList<String>(Arrays.asList(available));
        for (int c = 0; c < orders.length; c++) {
            String[] ingredients = orders[c].split(" ");

            boolean has = true;
            for (int b = 0; b < ingredients.length; b++) {
                has = a.contains(ingredients[b]) && has;
            }
            if (has) {
                return c;
            }
        }
        return -1;
    }
}
