import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        //program  to rotate an array by k ppositions to the right
        //if the array is: 12345 k=2 45123
        Scanner scn=new Scanner(System.in);
        System.out.println("enter array size");
        int n = scn.nextInt();
        System.out.println("enter array elements:");
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scn.nextInt();
            }
            System.out.println("enter k value:");
            int k=scn.nextInt();
            int i,j;
            k=k%n;//2%5=2
            System.out.println("the rotated array is:");
            for(i=0;i<n;i++)
            {
                if(i<k)//0<2 1<2
                {
                    System.out.println(a[n-k+i]);//a[5-2+0]=a[3]  a[5-2+1]=a[4]

                }
                else
                {
                    System.out.println(a[i-k]);//a[2-2]=a[0]....a[1],a[2]..
                }
            }
            /*System.out.println("array after rotation:");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }*/
    }
}
            
            