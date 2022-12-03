package practice;


import java.util.Scanner;

public class Peterson_no {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int x=number;
		int last=0,fact=1,sum=0;
		while(x !=0)
		{
			last=x%10;
			x=x/10;
			for(int i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			fact=1;
			
		}
		
		if(sum==number)
		{
			System.out.println("Its a petersomn no");
		}
		else {
			System.out.println("Its not a peterson number");
		}
	}
}
