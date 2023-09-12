import java.util.Scanner;

/*
Question title = otagh faraar - اتاق فرار
https://quera.org/problemset/123801/
 */
public class OtaaghFaraar {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String firstDisk = getInput();
        String secondDisk = getInput();


        boolean result = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (result) {
                    break;
                }
                if (check(firstDisk, secondDisk)) {
                    result = true;
                    break;
                }
                secondDisk = move(secondDisk);
            }
            firstDisk = move(firstDisk);
        }
        
        if (result)
            System.out.println("Boro joloo :)");
        else
            System.out.println("Gir oftadi :(");

    }

    static String move(String disk) {
        StringBuilder result = new StringBuilder(disk);
        String letter = result.charAt(0) + "";
        result.deleteCharAt(0);
        result.append(letter);
        return result.toString();
    }

    static boolean check(String first, String second) {
        first = first.substring(1, 4);
        second = second.substring(1, 4);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 2; i++) {
            int sum = Integer.parseInt(first.charAt(i) + "") + Integer.parseInt(second.charAt(i) + "");
            String text = (sum + "").charAt((sum + "").length() - 1) + "";
            result.append(text);
        }

        int total = Integer.parseInt(result.toString());

        return total % 6 == 0;
    }

    static String getInput() {
        String line = sc.nextLine();
        return line.replaceAll(" ", "");
    }
}
