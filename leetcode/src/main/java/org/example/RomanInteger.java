package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
   static public int romanToInt(String s) {
        Map kv= new HashMap<Character,Integer>();
        kv.put('M',1000);
        kv.put('D',500);
        kv.put('C',100);
        kv.put('L',50);
        kv.put('X',10);
        kv.put('V',5);
        kv.put('I',1);
        int sum=0;
        char prv = ' ';
        for(char ch:s.toCharArray()){
            sum = sum + (int)kv.get(ch);
            if(prv == ' '){
                prv = ch;
                continue;
            }

            switch (ch){
                case 'M', 'D': {
                    if(prv !='M')
                        sum = sum - (int)kv.get(prv) * 2;
                    prv = ch;
                    break;
                }
                case 'C': {
                    if(prv !='M' && prv !='D' && prv !='C')
                        sum = sum - (int)kv.get(prv) * 2;
                    prv = ch;
                    break;
                }case 'L': {
                    if(prv =='X' || prv =='V' || prv =='I')
                        sum = sum - (int)kv.get(prv) * 2;
                    prv = ch;
                    break;
                }case 'X': {
                    if( prv =='V' || prv =='I')
                        sum = sum - (int)kv.get(prv) * 2;
                    prv = ch;
                    break;
                }case 'V': {
                    if( prv == 'I')
                        sum = sum - 2;
                    prv = ch;
                    break;
                } default:prv = ch;

            }
        }
        return sum;
    }

    public String intToRoman(int num) {
        Map<Integer,Character> translations=new HashMap();
        translations.put(1,'I');
        translations.put(5,'V');
        translations.put(10,'X');
        translations.put(50,'L');
        translations.put(100,'C');
        translations.put(500,'D');
        translations.put(1000,'M');

        int max;
        StringBuilder str = new StringBuilder();
        while(num!=0){
            max = Collections.max(translations.keySet());
            if(num<max) {
                translations.remove(max);
                continue;
            }
            str.append(translations.get(max));
            num -= max;
        }
        String s = str.toString();
        s = s.replace("DCCCC","CM");
        s = s.replace("CCCC","CD");
        s = s.replace("LXXXX","XC");
        s = s.replace("XXXX","XL");
        s = s.replace("VIIII","IX");
        s = s.replace("IIII","IV");

        return s;
    }
}
