import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Scanner sc          = new Scanner(System.in);
        //class obj name    = create claas
        // different types of sets
        HashSet<Integer> hs = new HashSet<>();//ordering cannot be decided -> O(1)
        TreeSet<Integer> ts = new TreeSet<>(); //sorted order -> O(logn)
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); //insertion order -> O(n)
        //inseting at the end of LL
        // lexico
        int arr[] = {1,2,7,6,4,15,3,2};
        for(int i=0;i< arr.length;i++){
            hs.add(arr[i]);
            ts.add(arr[i]);
            lhs.add(arr[i]);
        }

        System.out.println(hs);
        System.out.println(ts);
        System.out.println(lhs);

    }
}
