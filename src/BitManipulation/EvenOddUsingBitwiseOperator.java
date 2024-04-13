package BitManipulation;

public class EvenOddUsingBitwiseOperator extends BitManipulation{
    //Even number : multiple of 2
    //Odd Number : other than the multiples of 2

    // Most significant bit (MSB)<-- 110101 -->Least significant bit(LSB)
    //Even Number  ->  LSB = 0 (Unset)
    //Odd Number -> LSB = 1 (Set)

    public static void main(String[] args){
        int numb = decimalToBinary(105);
        System.out.println(numb);

        if((numb & 1) == 1){
            System.out.print("number is odd");
        }else{
            System.out.print("number is even!!");
        }
    }
}
