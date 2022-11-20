import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] x = new char[a.length()];
        x = a.toCharArray();
        java.util.Arrays.sort(x);
        char[] y = new char[b.length()];
        y = b.toCharArray();
        Arrays.sort(y);
        if (Arrays.equals(x, y)){
            return true;
        }
        else{
            return false;
        }
    }
}
