package Arrays;

public class matrixop {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},/// left = 0 --- right = 3
                     {5,6,7,8},
                     {9,0,1,2},
                     {4,5,2,6}};//top = 0 --- bottom = 3
        spiralprint(arr);
    }
    static void spiralprint(int[][] arr) {
        int left = 0;
        int right = arr.length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        //left to right
        lefttoright(arr,left,right);
        System.out.println(" ");
        righttobottom(arr,right,bottom);
        System.out.println("");
        bottomtotop(arr,top,bottom);
        System.out.println("");
        toptoleft(arr,top,bottom);
    }
    static void lefttoright(int[][] arr,int left, int right ){

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[left][i]);

        }
    }
    static void righttobottom(int[][] arr,int right,int bottom){
        for(int j=0;j<=right;j++){
            System.out.print(arr[j][right]);
        }

    }
    static void bottomtotop(int[][] arr,int top,int bottom){
        for (int i=bottom;i>=0;i--){
            System.out.print(arr[bottom][i]);
        }

    }
    static void toptoleft(int[][] arr,int top,int bottom){

        for(int i=bottom;i>=0;i--){
            System.out.print(arr[i][top]);
        }
    }


    }

