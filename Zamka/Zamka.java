import java.util.ArrayList;

// input L D X

// L = (1 - 10 000)
// D = (1 - 10 000)
// L <= D

// X = (1 - 36)

// find the minimal integer N such that L <= N <= D; sum of its digits is X
// find the maximal integer M such that L <= M <= D; sum of its digits is X 


public class Zamka {
    int minNum, maxNum, sumNum, sumDigits;

    public Zamka(int minNum, int maxNum, int sumNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.sumNum = sumNum;
        this.sumDigits = calcDigits(sumNum);
    }

    private int calcDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    private int calcSum(int in) {
        String number = Integer.toString(in);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i, i + 1));
        }

        return sum;

    }

    private int[] numToDigits(int x) {
        int[] numDig = new int[calcDigits(x)];
        int num = x;

        for (int i = numDig.length - 1; i >= 0; i--) {
            numDig[i] = num % 10;
            num = num / 10;
        }

        return numDig;
    }

    public int calcMin() {
        if (minNum == sumNum)
            return sumNum;

        if (sumDigits == 1 && minNum < sumNum)
            return sumNum;

        if (calcSum(minNum) == sumNum) {
            return minNum;
        }

        int minDig = calcDigits(minNum);

        if (minDig == 1) {
            minDig++;
        }

        int divide = sumNum / minDig;
        int rest = sumNum % minDig;

        int[] originalDigits = numToDigits(minNum);
        int[] digits = new int[minDig];

        for (int i = 0; i < digits.length; i++) {
            if (i != digits.length - 1) {
                digits[i] = divide;
            } else {
                digits[i] = divide + rest;
            }
        }

        int substractIndex = 0;
        int addIndex = digits.length - 1;

        while (digits[digits.length - 1] < 9 && substractIndex < digits.length - 1) {
            if (digits[substractIndex] > originalDigits[substractIndex] && digits[addIndex] < 9) {
                digits[substractIndex] = digits[substractIndex] - 1;
                digits[addIndex] = digits[addIndex] + 1;

            } else {
                substractIndex++;
            }
        }

        String newNum = "";

        for (int n : digits) {
            newNum += Integer.toString(n);
        }

        return Integer.parseInt(newNum);

    }

    public int calcMax() {
        if (maxNum == sumNum)
            return sumNum;

        if (calcSum(maxNum) == sumNum) {
            return maxNum;
        }

        int maxDig = calcDigits(maxNum);

        if (maxDig == 1) {
            maxDig++;
        }

        int divide = sumNum / maxDig;
        int rest = sumNum % maxDig;

        int[] originalDigits = numToDigits(maxNum);
        int[] digits = new int[maxDig];

        for (int i = 0; i < digits.length; i++) {

            if (i != digits.length - 1) {
                digits[i] = divide;
            } else {
                digits[i] = divide + rest;
            }
        }

        int addIndex = 0;
        int substractIndex = digits.length - 1;

        while (digits[addIndex] < 9 && addIndex < digits.length - 1)

            if (digits[addIndex] < originalDigits[addIndex]) {
                if (digits[substractIndex] > 0) {
                    if (substractIndex - 1 > addIndex) {
                        substractIndex--;
                    }
                }
                digits[addIndex] = digits[addIndex] + 1;
                digits[substractIndex] = digits[substractIndex] - 1;
            } else {
                if (originalDigits[addIndex] == 0) {
                    digits[addIndex - 1] = digits[addIndex - 1] - 1;
                    digits[addIndex] = digits[addIndex] + 1;
                    originalDigits[addIndex] = 9;
                } else {
                    addIndex++;
                }
            }

        String newNum = "";

        for (int n : digits) {
            newNum += Integer.toString(n);
        }

        return Integer.parseInt(newNum);
    }

}
