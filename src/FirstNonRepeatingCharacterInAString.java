import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FirstNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch) == true) {
                int frq = hm.get(ch);
                hm.put(ch, frq + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.get(ch) == 1) {
                index = i;
                break;
            }
        }
        System.out.println(index);


    }

}