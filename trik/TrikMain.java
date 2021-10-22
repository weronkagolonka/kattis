import java.util.Scanner;

public class TrikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();

        Trik t = new Trik(letters);
        System.out.println(t.findPosition());
    }
}
