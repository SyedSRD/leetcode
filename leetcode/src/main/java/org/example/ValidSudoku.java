package org.example;

import java.util.*;

public class ValidSudoku {

    //Brut forc;
    public boolean isValidSudoku(char[][] board) {
            int LENGTH = 9;
            Set tmp = new HashSet();
            for(int i =0; i < LENGTH; i++){
                for (int j = 0; j < LENGTH; j++){
                        if (board[i][j] != '.' && tmp.add(board[i][j]) == false) {
                            System.out.println(board[i][j]);
                            System.out.println(i);
                            System.out.println(j);
                            return false;
                        }
                }
                tmp.clear();
            }
            for(int i =0; i < LENGTH; i++){
                for (int j = 0; j < LENGTH; j++){
                        if (board[j][i] != '.' && tmp.add(board[j][i]) == false) {
                            System.out.println(board[j][i]);
                            System.out.println(j);
                            System.out.println(i);
                            return false;
                        }
                }
                tmp.clear();
            }
        int maxCol = 0, maxRo = 0;
        for(int i = 0; i < LENGTH; i+=3) {
            maxRo += 3;
            //System.out.println(i);
            for (int j = 0; j < LENGTH; j+=3) {
                maxCol +=3;
                //System.out.println(j);
                while(  i < maxRo && j < maxCol) {

                    if (board[i][j] != '.' && (tmp.add(board[i][j]) == false ))
                        return false;
                    else if(board[i][j+1] != '.' && (tmp.add(board[i][j+1]) == false ))
                        return false;
                    else if(board[i][j+2] != '.' && (tmp.add(board[i][j+2]) == false ))
                        return false;


                    i++;

                }
                i = maxRo - 3;
                tmp.clear();
            }
        }

            return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        int LENGTH = 9;
        ArrayList<Set<Character>> cols = new ArrayList<>();
        ArrayList<Set<Character>> ro = new ArrayList<>();
        ArrayList<Set<Character>> sqr = new ArrayList<>();


        int box = 0;
        for(int i =0; i < LENGTH; i++){
            ro.add(i,new HashSet<>());
            for (int j = 0; j < LENGTH; j++){
                if(i==0) {
                    cols.add(j, new HashSet<>());
                    sqr.add(j, new HashSet<>());
                }

                if (board[i][j] == '.' )
                    continue;
                if(!cols.get(j).add(board[i][j]) || !ro.get(i).add(board[i][j]) || !sqr.get(j%3 + box).add(board[i][j])) {
                    System.out.println(board[i][j]);
                    System.out.println(ro.get(i).toString());
                    System.out.println(cols.get(j).toString());
                    System.out.println(i);
                    System.out.println(j);
                    return false;
                }
            }
            box +=3;
        }

        return true;
    }

}
