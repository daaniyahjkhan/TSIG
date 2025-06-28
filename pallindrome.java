import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        if(x<0){
            System.out.println("cant do -ve nos");
            //return false
        }
        int rev=0;
        int og=x;
        while(x!=0){
            int n=x%10;
            rev=rev*10+n;
            x=x/10;
        }
        if(rev==og){
            System.out.println("is a palindrome ");
        }
        else{
            System.out.println("is nottt a palindrome ");
        }


        //USING STRINGS..... 
        //boolean ispall=true;
        // String str=Integer.toString(x);
        // for(int i=0;i<str.length()/2;i++){
        //     if(str.charAt(i)!=str.charAt(str.length()-1-i))
        //     {
        //         ispall=false;
        //         break;
        //     }

        // }
        // if(ispall){
        //     System.out.println("it is a pallindrome!!");
        // }
        // else{
        //     System.out.println("is not a palindrome ");
        // }
        
    }
    
}
