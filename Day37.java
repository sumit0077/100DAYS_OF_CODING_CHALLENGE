import java.util.Scanner;

public class Spy_no {
public static void main(String[] args) {
	System.out.print("Enter the no");
	Scanner scanner =new Scanner(System.in) ;
	int no=scanner.nextInt();
	int sum=0;
	int product=1;
	while(no >0)
	{
		int c=no%10;
		sum=sum+c;
		product=product*c;
		no/=10;
	}
	if(sum==product)
		System.out.println("Sum is " +sum+ " product " +product+"\n Spy number ");
	else {
		System.out.println("Sum is " +sum+ " product " +product+"\n Not a Spy number ");
	}
}
}
