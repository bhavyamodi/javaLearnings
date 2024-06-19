package miniProjects;
import java.util.Scanner;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args){
        double num1, num2 = 0;
        double result = 0;
        char operator;
        System.out.println("Welcome to Calculator !");

        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an operator (+, -, *, /, ^, !): ");
            operator = input.next().charAt(0);
            validateOperator(operator);

            if(operator == '!'){
                System.out.print("Enter the number: ");
                num1 = input.nextDouble();
                if (num1 < 0 || num1 != (int)num1) {
                    throw new IllegalArgumentException("Factorial is not defined for non-integer or negative numbers.");
                }
            }else{
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();

                if (operator == '/' && num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            }

            result = switch (operator) {
                case '+' -> sum(num1, num2);
                case '-' -> diff(num1, num2);
                case '*' -> multiply(num1, num2);
                case '/' -> division(num1, num2);
                case '^' -> pow(num1, (int) num2);
                case '!' -> factorial(num1);
                default -> result;
            };
            System.out.println("result "+result);
            input.close();
        }catch(Exception ex){
            System.out.println("Invalid Input Given "+ex);
        }

    }

    public static void validateOperator(char operator) throws Exception {

        HashMap<Character, String> validOperators = new HashMap<>();
        validOperators.put('+', "sum");
        validOperators.put('-', "diff");
        validOperators.put('*', "multiply");
        validOperators.put('/',"division");
        validOperators.put('%',"percentage");
        validOperators.put('^', "power");
        validOperators.put('!', "factorial");
        if(!validOperators.containsKey(operator)){
            throw new Exception("Invalid Operator.");
        }
    }


    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double diff(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static double pow(double num1, int num2){
        if (num2 == 0) {
            return 1.0;
        }

        double halfPower = pow(num1, num2 / 2);

        if (num2 % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return num1 * halfPower * halfPower;
        }
    }

    public static double factorial(double num1){
        if(num1 == 1 || num1 == 0) return 1.0;
        return num1 * factorial(num1 - 1);
    }
}

