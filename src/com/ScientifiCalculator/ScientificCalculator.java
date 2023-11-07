package com.ScientifiCalculator;
import java.util.Scanner;
public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Scientific Calculator");
        System.out.println("---------------------");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("---------------------");
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Square Root");
        System.out.println("---------------------");
        
        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();
        
        double result = 0;
        
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            case 5:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 6:
                result = Math.sqrt(num1);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation number.");
        }
        
        scanner.close();
    }


	
}
