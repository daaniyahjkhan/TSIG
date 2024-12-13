import java.util.Scanner;

public class majority {
    static int majorityElement(int arr[]) {
        int d=0,i,j;
        int n= arr.length;
        for(i=0;i<n;i++)
        {
            d=0;
            for(j=0;j<n;j++)
            {
                
                if(arr[i]==arr[j])
                {
                    d++;
                }
            }
            if(d>n/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        
        Scanner scn=new Scanner(System.in);
            System.out.println("enter the size of the array:");
            int n=scn.nextInt();
            int i;
            int[] arr = new int[n];
            System.out.println("enter the elements of the array:");
            for( i=0;i<n;i++)
            {
                arr[i]=scn.nextInt();
            }
        System.out.println(majorityElement(arr));
    }
    }
    