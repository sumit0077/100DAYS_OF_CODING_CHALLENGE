import java.util.Scanner;

public class sunny_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the no");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int x=(int)Math.sqrt(no+1);
		if(x*x==no)
		{
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}
}
