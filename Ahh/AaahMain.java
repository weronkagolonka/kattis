import java.util.Scanner;

public class AaahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] examination = new String[2];

        for (int i = 0; i < examination.length; i++) {
            examination[i] = sc.nextLine();
        }

        Aaah a = new Aaah(examination[0], examination[1]);
        a.isWorth();
    }
}
