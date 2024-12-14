import java.util.*;
public class fibonacci {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a limit for till where to print the series:");
        int n=scn.nextInt();
        int i;
        int n1=0,n2=1,n3=0;
        System.out.println("fibonacci series:");
        
        System.out.println(n1);
        System.out.println(n2);
        n3=n1+n2;
        for (i=3;i<=n;i++)
        {
            System.out.println(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }
    }
}
