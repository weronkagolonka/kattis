import java.util.Scanner;

public class ExamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[3];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }

        Exam e = new Exam(input[1], input[2], Integer.parseInt(input[0]));
        System.out.println(e.calcScore());
    }
}
