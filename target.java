import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        //search for target element in an array!!
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        int k=0;
        System.out.println("Enter the elements of the array");
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int tar=sc.nextInt();
        for(i=0;i<n;i++)
        {
        if (tar==arr[i]) 
        {
            System.out.println("the target was found at position"+(i+1));
            break;
        }
        }
        if(i==n)
        {
            System.out.println("the target was not found");
        }
        
    }
}
