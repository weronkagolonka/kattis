
import java.util.Scanner;

public class TwoStonesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        sc.close();

        TwoStones ts = new TwoStones(stones);
        System.out.println(ts.winner());
    }
}
