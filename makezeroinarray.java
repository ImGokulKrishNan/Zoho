package Arrays;

import java.util.Arrays;

public class makezeroinarray {

    public static void main(String[] args) {
        int[][] arr={{0,2,3},{4,5,6},{7,7,9}};
        int rows=arr.length-1;
        int cols= arr.length-1;
        zero(arr,rows,cols);

        for (int i = 0; i <= arr.length-1 ; i++) {

            System.out.println(Arrays.toString(arr[i]));

        }
    }
    static void zero(int[][] arr,int rows,int cols){
        for (int i = 0; i <=rows ; i++) {
            for (int j = 0; j <=cols ; j++) {
                if(arr[i][j]==0){
                    makezero(arr,i,j);
                }

            }
        }
        for (int i = 0; i <=rows ; i++) {
            for (int j = 0; j <=cols ; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }

            }
        }


    }
    static int[][] makezero(int[][] arr,int row,int col){
        for (int i = 0; i <=arr.length-1 ; i++) {
            arr[row][i]=-1;
        }
        for (int j = 0; j <=arr.length-1 ; j++) {
            arr[j][col]=-1;

            }
        return arr;
    }
}
