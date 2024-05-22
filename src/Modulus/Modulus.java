package Modulus;

public class Modulus {
    //limit our data to a required range
    //Remainder = Dividend - Divisor * Quotient
    // 150 % 11 = 150 - 143 = 7
    public static void main(String[] args){
        calculateMod(-40, 7);
    }

    public static void calculateMod(int a , int b){
        int modulus = a % b;
        System.out.println(modulus);
        if(modulus < 0){
            modulus = (a + b) % b ;
        }
        System.out.println(modulus);
    }

    public static void modularArithmetic(){
        //(a+b) % m = (a % m + b % m) % m -> to avoid overflow
        // (a * b) % m = (a % m * b % m) % m
        // (a % p) % p = a % p
        
    }

}
