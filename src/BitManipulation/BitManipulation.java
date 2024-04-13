package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        //AND(&) : Binary Operator - when both bit are set(1) then true else false,
        // OR(|) : Binary Operator - anyone bit is set(1) then true else false,
        // XOR(^) : Binary Operator - when both bit are same then false else true,
        // Negation/NOT(~/!) : Unary Operator - Inverse / Flip,
        // Left Shift(<<) :  It shifts every bit toward left.
        // Right Shift(>>): It shifts every bit towards right.

        truthTable();
        Calculate(20,45);
        leftShiftOperator(10);
        rightShiftOperator(10);
    }

    public static void truthTable(){
        System.out.println("_____________________");
        System.out.println("| a | b | & | | | ^ |");
        System.out.println("| 1 | 1 | 1 | 1 | 0 |");
        System.out.println("| 1 | 0 | 0 | 1 | 1 |");
        System.out.println("| 0 | 1 | 0 | 1 | 1 |");
        System.out.println("| 0 | 0 | 0 | 0 | 0 |");
        System.out.println("_____________________");
    }

    public static void Calculate(int number1, int number2){
        int numb1 = decimalToBinary(number1);
        int numb2 = decimalToBinary(number2);
        System.out.println("numb1 : "+numb1+" numb2 : "+numb2);
        int and1 = number1 & number2;
        System.out.println("and : "+and1 +" "+ decimalToBinary(and1));
        int or1 = number1 | number2;
        System.out.println("or : "+or1 + " " + decimalToBinary(or1));
        int not1 = number1 ^ number2;
        System.out.println("not : "+not1 +" "+ decimalToBinary(not1));
    }

    public static void leftShiftOperator(int number){
        //a << 1 : a * 2
        //a << 2 : a * 2 * 2
        //a << 3 : a * 2 * 2 * 2
        // If there is no overflow : a << N -> a * (2 Pow N)
        //1 << N = 2 Pow N

        int numb = decimalToBinary(number);
        int leftShift = number << 1;
        System.out.println("number "+number+" binary "+numb+"\nleft number " + leftShift + " left shift "+decimalToBinary(leftShift));
    }

    public static void rightShiftOperator(int number){
        //a >> 1 : a / 2
        //a >> 2 : a / 2 * 2
        //a >> 3 : a / 2 * 2 * 2
        // a >> N -> a / (2 Pow N)

        int numb = decimalToBinary(number);
        int rightShift = number >> 1;
        System.out.println("number "+number+" binary "+numb+"\nright number " + rightShift + " right shift "+decimalToBinary(rightShift));
    }

    public static int decimalToBinary(int n){
        int binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n > 0) {
            remainder = n % 2;
//            System.out.println("Step " + step++ + ": " + n + "/2");
//            System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
//        System.out.println(binaryNumber);
        return binaryNumber;
    }
}
