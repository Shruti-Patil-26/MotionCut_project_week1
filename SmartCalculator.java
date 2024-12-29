import java.util.Scanner;
public class SmartCalculator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the console-based calculator");
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		
		while(true)
		{
			//to take first user input number
			while(true)
			{
				try 
				{
					System.out.println("Enter first number ");
					
					num1=Double.parseDouble(sc.nextLine());
					break;
				}
				catch (NumberFormatException ex) {
					System.out.println("Error:Invalid Input Please Enter numeric value ");
				}
			}
			//to take second user input number
			while(true)
			{
				try
				{
					System.out.println("Enter second number = ");
					num2=Double.parseDouble(sc.nextLine());
					break;
				}
				catch (NumberFormatException e) {
					System.out.println("Error:Invalid Input Please Enter numeric value ");
				}
			}
			
			//to take user choice operation
			System.out.println("Enter which operation you want to perform (+,-,*,/)");
			char operation=sc.next().charAt(0);
			
			double result;
			
			//to perform operation according to user choice->
			switch (operation) {
			case '+':
					result=num1+num2;
					System.out.println("Addition is = "+result);
				break;
				
			case '-':
					result=num1-num2;
					System.out.println("Subtraction is = "+result);
				break;
			
			case '*':
					result=num1*num2;
					System.out.println("Multiplication is = "+result);
					break;
					
			case '/':int cd=0;
					while(true)
					{
						// to check is their divide by zero error or not
						if(num2==0)
						{
							System.out.println("Error:Divide by zero is not allowed ");
							try
							{
								System.out.println("Please re-enter second number : ");
								if(cd==0)
									sc.nextLine();
								
								cd++;
								num2=Double.parseDouble(sc.nextLine());
								
							}
							catch (NumberFormatException e) {
								System.out.println("Error:Invalid Input Please Enter numeric value ");
							}
						}
						else
							break;
					}
					result=num1/num2;
					System.out.println("Division is = "+result);
					break;

			default:
				System.out.println("Please enter valid operation ");
				break;
			}
			
			//asking user, he/she want to perform another some operation or exit the program
			System.out.println("You want to perform another calculation (yes or no) ");
			String choice=sc.next();
			
			if(!choice.equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		System.out.println("Thank you for using smart calculator ");
		sc.close();
	}

}
