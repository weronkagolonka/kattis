
public class Faktor {
    int articles, reqFaktor;

    public Faktor(int articles, int reqFaktor) {
        this.articles = articles;
        this.reqFaktor = reqFaktor;
    }

    public int calcminScientists() {
        int tempScientists = articles * reqFaktor;
        double tempFactor = (double) tempScientists / (double) articles;

        while (tempFactor > (double) reqFaktor - 1) {
            tempScientists--;
            tempFactor = (double) tempScientists / (double) articles;
        }

        if (tempScientists / articles < reqFaktor) {
            return tempScientists + 1;
        }

        return tempScientists;
    }
}
