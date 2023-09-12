import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Question title = Hefz tartib - حفظ ترتیب
https://quera.org/problemset/1359/
 */

public class HefzTartib {
    private static String d2 = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());

        List<String> output = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String d1 = sc.nextLine();
            d2 = sc.nextLine();

            boolean result = process(d1);
            if (!result) {
                d1 = new StringBuilder(d1).reverse().toString();
            }
            if (process(d1))
                output.add("YES");
            else
                output.add("NO");
        }
        for (String i : output) {
            System.out.println(i);
        }
    }

    private static boolean process(String d1) {
        int last = -1;
        boolean r = true;

        for (int i = 0; i < d2.length(); i++) {
            int index = d1.indexOf(d2.charAt(i), last + 1);

            if (index > last) {
                last = index;
            } else {
                r = false;
                break;
            }
        }
        return r;
    }
}
