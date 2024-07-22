package DSA.ARRAY;

import java.util.Arrays;

public class Movezeroend {

    public static void main(String[] args) {
        int[] n={0,1,0,3,12};
       int[] k= zoho(n);
        System.out.println(Arrays.toString(k));
    }
    static int[] zoho(int[] nums){

        int j=0; int temp;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        System.gc();
        return nums;
    }
}
