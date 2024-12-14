import java.util.*;
public class arrayeven {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=scn.nextInt();
        System.out.println("enter array elements:");
        int arr[]=new int[n];
        int s=0;
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                s=s+arr[i];
            }
        }
        System.out.println("the sum of the even elements of th earray is:" +s);

    }
}
