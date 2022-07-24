import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int freq = hm.get(arr[i]); // get wil get the value
                hm.put(arr[i], freq + 1);
            } else {
                hm.put(arr[i], 1); // put will set the key and value
            }
        }
        //keyset
        ArrayList<Integer> li = new ArrayList(hm.keySet());
        Collections.sort(li, (a, b) -> {
            if (hm.get(a) < hm.get(b)) return 1;
            if (hm.get(a) == hm.get(b) && a < b) {
                return 1;
            }
            return -1;
        });

        for (int num : li) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}