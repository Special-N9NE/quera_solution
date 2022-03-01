import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Question title = Nameye Bad - نامه ی بد
https://quera.org/problemset/7609/
 */

public class NameyeBad {

    private static List<Character> dupList = new ArrayList<>();
    private static List<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        for (char i : chars) {
            dupList.add(i);
            if (!list.contains(i))
                list.add(i);
        }

        boolean isKhoob = true;
        for (char i : list) {
            if (numOfChar(i) % 2 != 0) {
                isKhoob = false;
                break;
            }
        }
        System.out.println(isKhoob ? "khoob" : "bad");
    }

    private static int numOfChar(char c) {
        int counter = 0;
        for (int i = 0; i <= dupList.size() - 1; i++) {
            if (dupList.get(i) == c) {
                counter++;
            }
        }
        return counter;
    }
}