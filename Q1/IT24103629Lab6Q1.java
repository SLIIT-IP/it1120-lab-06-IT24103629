import java.util.Scanner;
public class IT24103629Lab6Q1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = input.nextInt();
		
		double square = num * num;
		double squareRoot = Math.sqrt(num);
		
		System.out.print("The square of "+num+" is: "+square);
		System.out.print("\nThe square root of "+num+" is: "+squareRoot);
	}
}
