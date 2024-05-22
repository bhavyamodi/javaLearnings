package String;

public class stringOperations {
    /*
    * Creation: String str = "Hello";
    * Concatenation: String newStr = str + " World";
    * Length: int length = str.length();
    * Accessing characters: char ch = str.charAt(index);
    * Substring: String substr = str.substring(startIndex, endIndex);
    * Comparing: boolean isEqual = str.equals(anotherString);
    * Searching: int index = str.indexOf(substring);
    */

    public static void main(String[] args){
        String str = "hello";
        System.out.println("str : "+str);

        //str = concat(str," World");
        //System.out.println("newString : "+str);

        int strLength = str.length();
        System.out.println("strLength "+strLength);

        //iterateString(str);
        printAllSubstrings(str);
    }

    public static String concat(String str, String key){
       return str + key;
    }

    public static void iterateString(String str){
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println("Character at "+i+ " : "+ch);
        }
    }

    public static void printAllSubstrings(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j <= str.length(); j++){
                String subStr = str.substring(i, j);
//                System.out.println("subStr "+subStr);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
