package practice;

import java.util.Scanner;

public class Copy_array {
public static void main(String[] args) {
	System.out.print("Enter the no");
	Scanner scanner =new Scanner(System.in) ;
	int size=scanner.nextInt();
	int array[]=new int [size];
	int array1[]=new int [size];
	for(int i=0;i<size;i++)
	{
		array[i]=scanner.nextInt();
	}
	System.out.println("the original array is ");
	for(int i=0,j=0;i<size;i++,j++)
	{
		System.out.print(" "+array[i]);
	}
	for(int i=0,j=0;i<size;i++)
	{
		array1[j++]=array[i];
	}
	System.out.println("\nthe new copy array is ");
	for(int i=0,j=0;i<size;i++,j++)
	{
		System.out.print(" "+array1[i]);
	}
}
}
