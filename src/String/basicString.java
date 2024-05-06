package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basicString {

    public static void main(String[] args){
        String example = "abcdefbcdefcdefdefeff";
        toggleString(example);
        sortString(example);

    }

    public static void toggleString(String s){
        int n = s.length();
        StringBuilder result = new StringBuilder(s);
        StringBuffer stringData = new StringBuffer(s);
        for(int i = 0; i < n ; i++){

            //Core method
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
//                System.out.println("character is upper case!");
                result.setCharAt(i, (char) (s.charAt(i) + 32));
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122 ) {
//                System.out.println("character is lower case!");
                result.setCharAt(i, (char) (s.charAt(i) - 32));
            }

            //Bit Manipulation
            stringData.setCharAt(i, (char) (s.charAt(i) ^ (1 << 5)));

        }
        System.out.println("Toggle String via base method "+result);

        System.out.println("Toggle String via bit manipulation "+stringData);
    }

    public static void sortString(String s){

        int[] cnt = new int[26];
        for(int i =0;i<s.length(); i++){
            cnt[s.charAt(i) - 97]++;
        }

        StringBuilder answer = new StringBuilder(s);
        int k = 0;
        for(int i =0; i< s.length();i++){
            char ch = s.charAt(i);
            for(int j =0;j <cnt[i]; j++){
                answer.setCharAt(k, ch);
                System.out.println("char "+ch+" k "+k);
                k++;
            }
        }

        System.out.println(answer);
        System.out.println(Arrays.toString(cnt));
    }


}
