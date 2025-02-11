package org.example;

public class MathProb {
    public static  int[] plusOne(int[] digits) {
//        StringBuilder rs = new StringBuilder();
//        int[] nums ;
//
//        for(int x :digits)
//            rs.append(x);
//        long sum = Long.valueOf(rs.toString()) + 1;
//        rs.delete(0,rs.length());
//        rs.append(sum);
//        nums = new int[rs.length()];
//        for(int i=0;i<nums.length;i++) {
//            nums[i] = (int)(rs.toString().charAt(i) - '0');
//        }



        for(int i=digits.length-1; i >=0;i--){

            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        int[] ndigits = new int[digits.length +1 ];
        ndigits[0] = 1;
        for (int i=0;i<digits.length;i++)
            ndigits[i+1] = digits[i];
        return ndigits;
    }
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

}
