import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        //System.out.println(testCases); 
         
		while(testCases>0 && in.hasNext()){
			String line = in.nextLine();
            
			Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);  
            
          	if (matcher.find() == false) {  
                System.out.println("None");  
                continue;  
            }
            
            matcher.reset();  
             
            while (matcher.find() == true){  
                System.out.println(matcher.group(2));  
            }  
        } 
           
        in.close();    
		testCases--;
		
	}
}
