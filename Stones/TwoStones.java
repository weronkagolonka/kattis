
public class TwoStones {
    int stones;

    public TwoStones(int stones) {
        this.stones = stones;
    }

    public String winner() {
        if (stones % 2 == 0) {
            return "Bob";
        } else {
            return "Alice";
        }
    }
}
