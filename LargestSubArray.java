package Arrays;

import java.util.Arrays;

public class LargestSubArray {
    public static void main(String[] args) {

            int[] arr={-1,-2,3,-4,5,6};

        System.out.println(sum(arr));

    }
    static int  sum(int[] arr){
    int start=0;
    int end=1;

    int sum=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[start]<arr[end]){
                sum=sum+(arr[start]+arr[end]);
                start++;
                if(arr.length-1==end){
                    break;
                }
            }

        }
        return sum;
    }
}
