package Arrays;

public class matrix {
    public static void main(String[] args) {
       int [][] arr={{1,2},
                     {4,5}};
        int[][] arr1={{1,2},
                      {4,5}};
        int rows= arr.length;
        int col=arr[1].length;
        int[][] c=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                c[i][j]=0;
                for(int k=0;k<rows;k++) {
                    c[i][j]+=arr[i][k] * arr1[k][j];
                }System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");

        }

    }
}


