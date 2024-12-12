import java.util.Scanner;

public class duplicate {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int i,j;
        System.out.println("enter the size of the array:");
        int n=scn.nextInt();
        int[] a = new int[n];
        int[] b= new int[n]; int k=0;
        System.out.println("enter the elements of the array:");
        for( i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        System.out.println("the elements are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        //the elements that occur more than once in a given array 23234 op 23
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    b[k]=a[i];
                    k++;
                }

            }
        }
        System.out.println("duplicates are:");
        for(i=0;i<n;i++)
        {
            if (b[i]>0) {
                System.out.println(b[i]);
            }
           
        }
    }    
}