import java.util.Scanner;

public class ZamkaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(sc.nextLine());
        }

        Zamka z = new Zamka(input[0], input[1], input[2]);
        System.out.println(z.calcMin());
        System.out.println(z.calcMax());
    }
}
