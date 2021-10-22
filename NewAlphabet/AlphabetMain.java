import java.util.Scanner;

public class AlphabetMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Alphabet alph = new Alphabet(input);
        alph.translate();
    }
}
