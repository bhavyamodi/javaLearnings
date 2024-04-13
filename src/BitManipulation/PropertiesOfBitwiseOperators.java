package BitManipulation;

import java.util.Scanner;

public class PropertiesOfBitwiseOperators extends BitManipulation {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int number = myObj.nextInt();
        propertiesOfOR(number);
        propertiesOfXOR(number);
        commutativeProperty(number);
    }
    public static void propertiesOfOR(int number){
        //If any number is OR with 0 then it returns the number itself.
        // A | 0 = A
        // A | A = A
        int numb = decimalToBinary(number);
        System.out.println(number | 0);
        System.out.println(number | number);
    }

    public static void propertiesOfXOR(int number){
        //If any number is XOR with 0 then it returns the number itself.
        // A ^ 0 = A
        //If any number is XOR with itself then it will return 0.
        // A ^ A = 0

        int numb = decimalToBinary(number);
        System.out.println(number ^ 0);
        System.out.println(number ^ number);
    }

    public static void commutativeProperty(int number){
        //A & B = B & A
        //A | B = B | A
        //A ^ B = B ^ A

        //Associative : The order of operands will not affect the result of operations.
        int A = number + 1;
        int B = number + 2;
        int C = number + 3;
        int expression1 = (A & B) & C;
        int expression2 = A & (B & C);
        System.out.println(expression1 + " Binary "+decimalToBinary(expression1));
        System.out.println(expression2 + " Binary "+decimalToBinary(expression2));
        System.out.println(1^3^5^3^2^1^5);
    }

    public static void leftBitProperty(int number){
        //Set i bit of a number
        // N = N  | (1 << i)

        //Toggle/Flip i bit of a number
        // N = N ^ (1 << i)

        //Check if i bit is set
        // N & ( 1 << i ) is greater than 0 then i bit is set.

    }
}

