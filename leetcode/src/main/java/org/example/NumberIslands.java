package org.example;


import java.util.*;

public class NumberIslands {

//    public int numIslands(char[][] grid) {

//        Map<Integer, Set<int[]>> map = new HashMap<>();
//        boolean flagFound = false;
//        int Island = 0,row = 0,col = 1;
//
//        for( int r = 0; r < grid.length; r++ )
//            for( int c = 0; c < grid[r].length; c++ ){
//                if( grid[r][c] == '1'){
//                    if (map.isEmpty()) {
//                        map.put(++Island, new HashSet<>());
//                        map.get(Island).add(new int[]{r,c});
//                        continue;
//                    }
//                    for( Map.Entry<Integer, Set<int[]>> e : map.entrySet() ){
//                        Set<int[]> newSet =  e.getValue();
//                        for( int[] rc: newSet){
//                            if (!flagFound && (Arrays.equals(rc, new int[]{r + 1, c})
//                                    || Arrays.equals(rc, new int[]{r - 1, c})
//                                    || Arrays.equals(rc, new int[]{r, c + 1})
//                                    || Arrays.equals(rc, new int[]{r, c - 1})
//                            )){
//                                System.out.println(Island);
//                                System.out.println(r+c);
//                                newSet.add(new int[]{r, c});
//                                flagFound = true;
//                                break;
//                            }
//                        }
//                        if (flagFound)
//                            break;
//                    }
//
//                    if(!flagFound){
//                        map.put(++Island, new HashSet<>());
//                        map.get(Island).add(new int[]{r,c});
//                    }
//                    flagFound = false;
//
//                }
//            }
//        return Island;


        // A function to check if a given cell (row, col) can
        // be included in DFS
        boolean isSafe(int M[][], int row, int col, boolean visited[][]){
            // row number is in range, column number is in range
            // and value is 1 and not yet visited
            return (row >= 0) && (row < M.length) && (col >= 0)
                    && (col < M[0].length)
                    && (M[row][col] == 1 && !visited[row][col]);
        }

        // A utility function to do DFS for a 2D boolean matrix.
        // It only considers the 8 neighbors as adjacent
        // vertices
        void DFS(int M[][], int row, int col, boolean visited[][]){
            // These arrays are used to get row and column
            // numbers of 8 neighbors of a given cell
            int rowNbr[]
                    = new int[] { -1, 0, 0, 1  };
            int colNbr[]
                    = new int[] {  0,-1, 1, 0 };

            // Mark this cell as visited
            visited[row][col] = true;

            // Recur for all connected neighbours
            for (int k = 0; k < 4; ++k)
                if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
                    System.out.println(visited[row][col]);
                    DFS(M, row + rowNbr[k], col + colNbr[k],
                            visited);
                }
        }

        // The main function that returns count of islands in a
        // given boolean 2D matrix
        int numIslands(int M[][]){
             int ROW = M.length;
             int COL = M[0].length;
            // Make a bool array to mark visited cells.
            // Initially all cells are unvisited
            boolean visited[][] = new boolean[ROW][COL];

            // Initialize count as 0 and traverse through the
            // all cells of given matrix
            int count = 0;
            for (int i = 0; i < ROW; ++i)
                for (int j = 0; j < COL; ++j)
                    if (M[i][j] == 1
                            && !visited[i][j]) // If a cell with
                    { // value 1 is not
                        // visited yet, then new island found,
                        // Visit all cells in this island and
                        // increment island count
                        DFS(M, i, j, visited);
                        ++count;
                    }

            return count;

    }
}
