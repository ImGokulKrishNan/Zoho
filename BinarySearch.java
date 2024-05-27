package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int target=6;
        int left=0;
        int right=arr.length-1;
        int mid=left+(right-left)/2;
        for (int i = 0; i <= arr.length-1 ; i++) {

            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            if(arr[mid]<target){
                left=mid+1;
                search(arr,left,right,target);
                break;
            }
            if(arr[mid] > target){
                search(arr,left,mid,target);
                break;
            }
        }

    }
    static void search(int[] arr,int left,int right,int target){
        while(left<right) {
            if (arr[left] == target) {
                System.out.println(left);
                break;
            }
            left++;

        }
    }


}
