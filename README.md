# Zoho-Problems

1. Print the word with odd letters as(Programmers)

```
	class Main {
	    static void pattern(String s,int len){
	        int i,j,k;
	        for(i=0;i<len;i++){
	            j=len-1-i;
	            for(k=0;k<len;k++){
	               
	            if(k==i||k==j){
	                System.out.print(s.charAt(k));
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println("");
	    }
	    }
	 
	    public static void main(String[] args){
	        String s="Programmers";
	        int len = s.length();
	        pattern(s, len);
	    }     
	}




P         s
 r       r 
  o     e  
   g   m   
    r m    
     a     
    r m    
   g   m   
  o     e  
 r       r 
P         s



public class Main
{
public static void main(String[] args) {
String s=" l|*e*et|c**o*de|";
	   
int ans = 0, j=0;
for (int i=0; i<s.length(); ++i) {
    
if (s.charAt(i)=='*' &&j%2==0)
    ans++;
if (s.charAt(i)=='|')
        j++;
}
        System.out.print(ans);
		
	}
}


ans = 3

