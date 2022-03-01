import java.math.BigInteger;
import java.util.Scanner;

/*
Question title = Mosabegheye Asan - مسابقه ی آسان
https://quera.org/problemset/2439/
 */
public class MosabegheyeAsan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numForFac = sc.nextInt();
        char num = (sc.nextInt() + "").charAt(0);

        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= numForFac; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        char[] numbers = (result.toString()).toCharArray();
        int counter = 0;
        for (char i : numbers) {
            if (i == num) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
