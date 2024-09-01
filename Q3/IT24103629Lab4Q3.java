import java.util.Scanner;

public class IT24103629Lab4Q3 
{
    public static void main(String[] args) 
	{
        Scanner num = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = num.nextInt();
		
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
    }
}
