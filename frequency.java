import java.util.*;
public class frequency {
    static int freqOftarget(int arr[],int target)
    {
        int n=arr.length;
        int i,j;
        //count how many times an element tagettted occurs in the array
        int count=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                 count++;
            }
        }
        if(count==0)
        {
            return -1;
        }
        else 
        {
        return count;
    }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println(freqOftarget(arr,target));

    }
}
