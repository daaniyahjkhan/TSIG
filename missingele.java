import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class missingele {
    public static void main(String args[]){
        System.out.print("Enter array limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            FindingMissing.miss(a);
        }
    }
}

class FindingMissing{
    public static void miss(int[] a){
        int len = a.length;
        Set<Integer> num = new HashSet<>();
        for(int n: a) {
            num.add(n);
        }
        for(int i = 0; i < len; i++){
            if(!num.contains(i)){
                System.out.println(i);
            }
        }
    }
}

