package org.example;

public class Binary {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        // initialize the jth index
        int j = b.length()-1;
        // initialize the carry
        int carry = 0;
        // initialize the sum
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if(i>=0) sum = sum+a.charAt(i)-'0';
            if(j>=0) sum = sum+b.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
    static public int reverseBits(int n) {
        int newN = 0;
        for(int i = 0; i < Integer.SIZE; i++) {
            newN = newN << 1;

            if((n & 1) > 0) {
                newN = newN ^ 1;
            }
            n = n >> 1;
        }
        return newN;
    }
    public int hammingWeight(int n) {
        int count=0;
        for(int i = 0; i < Integer.SIZE; i++) {
            if ((n & 1) > 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public int singleNumber(int[] nums) {
        int rs=0;
        for (int i=0;i<nums.length;i++)
            rs ^=nums[i];
        return rs;
    }


}
