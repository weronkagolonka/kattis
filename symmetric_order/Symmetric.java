import java.util.Arrays;

public class Symmetric {
    String[] names;
    int nrSet;

    public Symmetric(String[] names, int nrSet) {
        this.names = names;
        this.nrSet = nrSet;
    }

    public void symmetricSort() {
        String[] sorted = new String[names.length];

        int indexBeginning = 0;
        int indexEnd = names.length - 1;

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                // index is even - insert from the end
                sorted[indexBeginning] = names[i];
                indexBeginning++;

            } else {
                // index is odd - insert from the begginig
                sorted[indexEnd] = names[i];
                indexEnd--;

            }
        }

        System.out.println("SET " + nrSet);
        for (String s : sorted) {
            System.out.println(s);
        }
    }
}
