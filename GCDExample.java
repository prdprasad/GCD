//Write a program to find the GCD of two numbers
import java.util.Scanner;
public class GCDExample{

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number:");
        num2 = sc.nextInt();
      
        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("GCD of given numbers is: %d", num2);
    }

}