public class Exam {
    String myAnswer, friendAnswer;
    int nrCorrect, nrTasks;

    public Exam(String myAnswer, String friendAnswer, int nrCorrect) {
        this.myAnswer = myAnswer;
        this.friendAnswer = friendAnswer;
        this.nrCorrect = nrCorrect;
        nrTasks = myAnswer.length();
    }

    public int calcScore() {
        int sameAnsw = 0;
        int diffAnsw = 0;

        for (int i = 0; i < nrTasks; i++) {
            if (myAnswer.charAt(i) == friendAnswer.charAt(i)) {
                sameAnsw++;
            } else {
                diffAnsw++;
            }
        }

        // nr tasks that friend got wrong
        int rest = nrTasks - nrCorrect;

        // whether the rest is lower or nr answers we had different
        int low = Math.min(rest, diffAnsw);

        diffAnsw -= low;
        rest -= low;
        sameAnsw += low;

        return sameAnsw - rest;

    }
}
