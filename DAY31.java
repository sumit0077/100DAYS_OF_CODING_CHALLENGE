import java.util.Scanner;
public class Neon_no {
public static void main(String[] args) {
	System.out.print("Enter the no");
	Scanner scanner =new Scanner(System.in) ;
	int no=scanner.nextInt();
	int sq=no*no;
	int sum=0,c;
	while (sq>0)
	{
		c=sq%10;
		sum+=c;
		sq/=10;
	}
	if(sum==no)
	{
		System.out.println("The number is a neon");
	}
	else {
		System.out.println("The number is a not neon");
	}
	
}
}
