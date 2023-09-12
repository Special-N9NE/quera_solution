import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Question title = jame footballi - جمع فوتبالی
https://quera.ir/problemset/148638/
 */

public class JameFootballi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> results = new ArrayList<>();
        int rows = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < rows; i++) {
            results.add(process(sc));
        }
        for (String i : results) {
            System.out.println(i);
        }
    }

    private static String process(Scanner sc) {
        int s = 0, p = 0;
        int sAway = 0, pAway = 0;
        for (int i = 1; i <= 4; i++) {
            int input = sc.nextInt();
            if (i == 3) {
                pAway = input;
            }
            if (i == 2) {
                sAway = input;
            }
            if (i % 2 != 0)
                p += input;
            else
                s += input;
        }
        if (s > p)
            return "esteghlal";
        else if (p > s)
            return "perspolis";
        else {
            if (sAway > pAway)
                return "esteghlal";
            else if (pAway > sAway)
                return "perspolis";
            else
                return "penalty";
        }
    }
}