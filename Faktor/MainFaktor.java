
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class MainFaktor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(i -> Integer.parseInt(i)).toArray();
        sc.close();

        Faktor f = new Faktor(input[0], input[1]);
        System.out.println(f.calcminScientists());
    }
}
