package org.example;

public class HappyNumber {

    String strSum;
    int sum;

    public boolean isHappy(int n) {
        if(n == 1 || n == 7)
            return true;

        if(n < 10)
            return false;

        sum = 0;
        strSum = String.valueOf(n);
        for( Character ch: strSum.toCharArray())
            sum += (int) Math.pow(ch -'0', 2);

        return isHappy(sum);

    }
}
