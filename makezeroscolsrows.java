package Arrays;

import java.util.Arrays;

public class makezeroscolsrows {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,8,7},
                     {9,8,0},
                };
        int row = arr.length-1;
        int col=arr[0].length-1;

        zero(arr,row,col);
        for(int i=0;i<=arr.length-1;i++) {
            System.out.println(Arrays.toString(arr[i])+" ");
        }
    }
    static int[][] zero(int[][] arr,int row,int col){

        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++) {
                if (arr[i][j] == 0){
                    makezeros(arr,i,j);
                }

            }
        }
        for (int i = 0; i <=row; i++) {
            for (int j = 0; j <=col; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }

            }

        }


        return arr;
    }
    static void makezeros(int[][] arr, int currows ,int curcol){
        for(int k=0;k<= arr.length-1;k++){
               arr[currows][k]=-1;
                }
        for(int m=0;m<=arr.length-1;m++){
               arr[m][curcol]=-1;

        }

    }
}
