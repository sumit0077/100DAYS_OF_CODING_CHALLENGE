import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
       
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
       
       Arrays.sort(s, new Comparator<Object>() {
       @Override
       public int compare(Object a1, Object a2) {
           BigDecimal bigDec1 = new BigDecimal((String)a1);
           BigDecimal bigDec2 = new BigDecimal((String)a2);
           return bigDec2.compareTo(bigDec1);
       }
       });
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
