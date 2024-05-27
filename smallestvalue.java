package Arrays;

public class smallestvalue {
    public static void main(String[] args) {

        int[] nums = {15,47,56,1,7,88,7898};
        int low=0;
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>low){
                low=i;
                j=low;
            }

        }System.out.println(low);

    }

}
