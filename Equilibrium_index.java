package DSA.ARRAY;

public class Equilibrium_index {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 6, 8, 1, 10};
        int k=zoho(arr);
        System.out.println(k);
    }
    static int zoho(int[] n){
        int k=0;int l=0;int h=0;int sum=0;
        int m=(n.length-1)/2;int j=n.length-1;

        for (int i = 0; i < m; i++) {
            l=l+n[i];
            h=h+n[j--];
        }
        if(l==h){
         return m;
        }
        return -1;
    }


}
