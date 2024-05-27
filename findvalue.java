package Arrays;

public class findvalue {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,8,0};
        //          0 1 2 3 4 5 6 7
        int target=8;
    int count=0;
        int start=0;
        int end= nums.length-1;
        int mid=(start+end)/2;
        int max=0;

        for(int i=0;i<nums.length;i++){

            if(nums[start]==target){
                System.out.println(start);
                break;
            }start++;
            if(nums[end]==target){
                System.out.println(end);
                break;
            }end--;
        }



    }
}
