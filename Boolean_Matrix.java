// Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1

import java.util.Arrays;

public class Boolean_Matrix {
    public static void main(String[] args) {
        int[][] n = {{1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};
                     zoho(n);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if(n[i][j]==-1){
                    n[i][j]=1;
                }
                System.out.print(n[i][j] + " ");
            }
            System.out.println("");

        }
    }

    static void zoho(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j] == 1) {
                    zero1(i, j, n);
                }

            }
        }
    }

    static void zero1(int i, int j, int[][] n) {
        for (int k = 0; k < n.length; k++) {
            for (int l = 0; l < n[0].length; l++) {
              n[i][l]=-1;
              n[k][j]=-1;

            }
        }


    }
}
