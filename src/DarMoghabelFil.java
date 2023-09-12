import java.util.Scanner;
/*
Question title = Dar moghable fil - در مقابل فیل
https://quera.ir/problemset/3030/
 */
public class DarMoghabelFil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int number = 2;

        if (x == y) {
            if (x == 2) {
                number = 7;
            }
        }
        System.out.println("1");
        System.out.println(number + " " + number);
    }
}