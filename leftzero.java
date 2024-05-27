package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class leftzero {
    public static void main(String[] args) {
        int[] arr = {1, 4, 67, 7, 0, 2, 6, 4, 0, 0,};

        sort(arr);
    }

    static void sort(int[] arr) {
        int temp = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] >= arr[end]) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            end--;
            if (end == start) {
                start++;
                end = arr.length - 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}