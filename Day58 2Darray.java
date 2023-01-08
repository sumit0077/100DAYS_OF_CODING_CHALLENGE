import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
    
    int max = -63;
    for(int i = 0;i<arr.size()-2;i++){
        for(int j =0;j<arr.get(i).size()-2;j++){
            int maxTemp = 0;
            for(int g = 0; g<3;g++){
                for(int h = 0; h < 3; h++){
                    if((g==1)&&(h==0||h==2)){
                        continue;
                    }
                    else{
                        maxTemp += arr.get(i+g).get(j+h);
                    }
                }
            }
            max = maxTemp>max?maxTemp:max;
        }
    }
    System.out.println(max);
    
        bufferedReader.close();
    }
}
