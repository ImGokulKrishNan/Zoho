package Arrays;

import java.util.Arrays;

public class soring0s1s2s {
    public static void main(String[] args) {
        int[] arr={1,2,0,1,2,0};
        int start=0;
        int end=arr.length-1;
        int temp;
      while(start<end){
            if(arr[start] > arr[end]){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }end--;
            if(start==end){
                start++;
                end= arr.length-1;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}
