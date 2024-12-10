import java.util.Scanner;

public class minmax {
    public static void main(String args[])
    {
        int n;
        int max=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        n=scn.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("max element is "+max);
        System.out.println("min element is "+min);
    }
}
