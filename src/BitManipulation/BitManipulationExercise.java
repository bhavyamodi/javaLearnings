package BitManipulation;

public class BitManipulationExercise {

    public static void main(String[] args){
        problem1();
        problem2(22101,3);
        problem3(4,3);
        problem4();
    }

    public static void problem1(){
        //Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
        int[] arr = {10,20,10,30,35,30,20,35};
        int uniqueElem = 0;
        for(int i : arr){
            uniqueElem ^= i;
//            System.out.println("Step "+i+" Unique Element "+uniqueElem);
        }
        System.out.println("problem 1 "+uniqueElem);
    }

    public static void problem2(int A, int B){
        //You are given a number A. You are also given a base B. A is a number on base B.
        //You are required to convert the number A into its corresponding value in decimal number system.
        int decimalNumber = 0;
        int position = 0;

        while(A > 0){
            int digit = A % 10;
            decimalNumber += (int) (digit * Math.pow(B, position));
//            System.out.println("decimalNumber "+decimalNumber+" position "+position+" digit "+digit);
            position++;
            A /= 10;
        }
        System.out.println("problem 2 "+decimalNumber);
    }

    public static void problem3(int A, int B){
        //Given a decimal number A and a base B, convert it into its equivalent number in base B.
        int i = 1;
        int baseNumber = 0;
        while(A > 0){
            int remainder = A % B;
            baseNumber += remainder * i;

            i *= 10;
            A /= B;
        }
        System.out.println("problem 3 "+baseNumber);
    }

    public static void problem4(){
        // If B-th bit in A is set, make it unset.
        //If B-th bit in A is unset, leave as it is.
        int A = 10;
        int B = 2;
        if((A & (1 << B)) > 0){ //check if i bit is set
            A = A ^ (1 << B); //unset the bit
        }
        System.out.println("problem 4 "+A);
    }
}
