/**
 *
 * Remove the duplicates in the String.
 *
 * Testcase 1:
 * Input: Java1234
 * Output: Javb1234
 * (Remove the second ‘a’ as it is duplicated)
 * (replace 'a' into 'b')
 * 
 * Testcase 2:
 * Input: Python1223:
 * Output: Python1234
 *
 *  (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced
 * for the duplicated 2)
 *
 * Testcase 3:
 * Input: aBuzZ9900
 * Output: aBuzC9012
 *
 * Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace
 * with capital C as the letter to be replaced is capital Z. The second 9 turns out to be zero
 * and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
      String s="aBuzZ9900000";
      String k1="";
      // convert String into char array
        char[] c=s.toCharArray();
        // loop for String length-1 / 2 so
        for (int i = 0; i < (s.length()-1)/2 ; i++) {
             k1= find(c);
        }
        System.out.println(k1);
    }

    static String find(char[] c) {
        int i = 0;
        int count = 1;int num=0;
        int j = 1;char m='a';int dub=0;
        while(j <= c.length) {
            if(j==c.length){
                i++;
                j=i+1;
                count=1;
            }
            if(i==c.length-1){
                break;
            }
            //c[i]=a ,c[j] = A same but upper and lower case condition false
            if (Character.isUpperCase(c[i])) {
                m = Character.toUpperCase(c[j]);//convert  char upper into lower ,lower into upper into String m;
            }
            if (Character.isLowerCase(c[i])) {
                m = Character.toLowerCase(c[j]);
            }
            if (Character.isDigit(c[i])) {
                m = c[j];
            }
            // char array value upper and lower value same in the count as duplicate
            if (c[i] == m ) {

                if (Character.isUpperCase(c[j])) {
                    c[j] = (char) ((c[j] - 'A' + count) % 26 + 'A');
                    count++;
                }
                if (Character.isLowerCase(c[j])) {
                    c[j] = (char) ((c[j] - 'a' + count) % 26 + 'a');
                    count++;
                }

                if (Character.isDigit(c[j])) {
                    c[j] = (char) ((c[j] - '0' + count) % 10 + '0');
                    count++;
                }
            }
            j++;
        }
        return String.valueOf(c);

        }
}



