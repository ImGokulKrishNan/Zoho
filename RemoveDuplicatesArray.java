package DSA.ARRAY;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] n={0,1,2,2,3,3,4,5};
        int k=remove(n);
        for (int i = 0; i < k ; i++) {
            System.out.print(n[i]+" ");
        }
    }
    static int remove(int[] n){
        if(n.length==1){
            return 1;
        }
        int k=0;int t=1;int i=1;
        while ( i < n.length) {
            if(n[k]!=n[i]){
                n[t++]=n[i];
                k++;
            }
            i++;
        }
        return k+1;
    }
}