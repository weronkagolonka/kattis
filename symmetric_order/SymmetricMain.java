import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SymmetricMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> arr = new ArrayList<>();

        boolean go = true;
        int length = 0;

        while (go) {
            try {
                length = sc.nextInt();

                if (length == 0) {
                    go = false;
                }
            } catch (InputMismatchException e) {
                String[] names = new String[length];
                for (int i = 0; i < length; i++) {
                    names[i] = sc.nextLine();
                }
                arr.add(names);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            Symmetric sym = new Symmetric(arr.get(i), i + 1);
            sym.symmetricSort();
        }
    }
}
