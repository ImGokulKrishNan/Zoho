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
	} ```
