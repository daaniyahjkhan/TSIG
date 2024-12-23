import java.util.*;

public class union {
    //input arrays from the user and assign them to an set datastructure which
    // stores the elemnts in sorted form 
    public static ArrayList<Integer> unions(int a[],int b[])
    {
        Set<Integer> st=new TreeSet<>();
        //put the two arrays in the set and return
        for(int i=0;i<a.length;i++)
        {
            st.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            st.add(b[i]);
        }
        //convert the set to an arraylist and return so as to remove duplicates
        ArrayList<Integer> res=new ArrayList<>(st);
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int  n=sc.nextInt();
        System.out.println("enter size of the 2nd array:");
        int  n2=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.println("enter the array:");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the 2nd array:");

        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> result=unions(a,b);
        System.out.println(result);
    }
}