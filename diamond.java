import java.util.*;
public class diamond {
    public static void main(String[] args) {
    //pattern to ritn diamond shape with **
    int i=0,n,j=0;
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the number of rows");
    n=scn.nextInt();
    //to print dimond shape.
    for ( i = 1; i <= n; i++) {
        for( j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        for(j = 1;j <= 2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for ( i = 5; i >=1; i--) {
        for(j = 1; j <= (n-i); j++){
            System.out.print(" ");
        }
        for(j = 1; j<=(2*i-1); j++){
            System.out.print("*");
        }   
        System.out.println();
    }
}
}
