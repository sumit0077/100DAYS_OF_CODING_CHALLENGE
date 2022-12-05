import java.util.Scanner;

public class Tech_no {
public static void main(String[] args) {
	System.out.println("Enter no");
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int count = 0,n=number ,first,second,square,sum;
	while(n!=0)
	{
		count++;
		n/=10;
	}
	if(count%2==0) {
		first=number%(int)Math.pow(10, count/2);
		second=number/(int)Math.pow(10,count/2 );
		sum=first+second;
		square=sum*sum;
		if(square==number)
			System.out.print("Its a tech number");
		else 
			System.out.print("Not a tech number");
	}
	else 
		System.out.print("Not a tech number");
}
}
