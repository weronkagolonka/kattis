import java.util.HashMap;

class Trik {
    String letters;
    HashMap<String, int[]> movements;

    public Trik(String letters) {
        this.letters = letters;
        movements = initializeMov();
    }

    private HashMap<String, int[]> initializeMov() {
        HashMap<String, int[]> map = new HashMap<>();
        int[] a = { 1, 2 };
        int[] b = { 2, 3 };
        int[] c = { 1, 3 };

        map.put("A", a);
        map.put("B", b);
        map.put("C", c);

        return map;
    }

    public int findPosition() {
        int currPos = 1;

        for (int i = 0; i < letters.length(); i++) {
            int[] pos = movements.get(Character.toString(letters.charAt(i)));

            for (int j = 0; j < 2; j++) {
                if (pos[j] == currPos) {
                    if (j == 0) {
                        currPos = pos[1];
                    } else {
                        currPos = pos[0];
                    }
                    break;
                }
            }
        }
        return currPos;
    }
}