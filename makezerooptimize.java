package Arrays;

import java.util.Arrays;

public class makezerooptimize {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                       {4, 0, 7},
                       {9, 8, 5},
        };
        int row = arr.length - 1;
        int col = arr[0].length - 1;

        zero(arr, row, col);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr[i]) + " ");
        }
    }

    static void zero(int[][] arr, int row, int col) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (arr[i][j] == 0) {
                    arr[0][i] = -1;
                    arr[i][0] = -1;
                }
            }
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (arr[0][i] == -1 || arr[i][0]==-1) {
                    arr[0][i] = 0;
                    arr[i][0] = 0;

                }
            }
        }
        for (int i = 0; i <= row; i++) {
            if(arr[0][i]==-1){
                arr[0][i]=0;
            }
            if(arr[i][0]==-1){
                arr[i][0]=0;
            }


        }

    }
}













