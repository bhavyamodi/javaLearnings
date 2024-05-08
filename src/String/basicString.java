package String;

import java.util.*;

public class basicString {

    public static void main(String[] args){
        String example = "abcdeAAFFAAbcdEfcdefAeff";
        System.out.println("original String : "+example);
        toggleString(example);
        sortString(example);
        //sortByOccurrence(example);

        substringOfStringIsPalindrome(example);


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
        //Works for lowerstring
        int[] cnt = new int[26];
        for(int i =0;i<s.length(); i++){
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122 ){
                cnt[s.charAt(i) - 97]++;
            }
        }

        StringBuilder answer = new StringBuilder();
        for(int i =0; i< s.length();i++){
            char ch = s.charAt(i);
            for(int j =0;j <cnt[i]; j++){
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122 ) {
                    answer.append(ch);
                    //System.out.println("char "+ch);
                }
            }
        }

        System.out.println(answer.toString());
    }

    public static void sortByOccurrence(String s){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i< s.length(); i++){
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                int currentValue = map.get(String.valueOf(s.charAt(i)));
                map.put(String.valueOf(s.charAt(i)), ++currentValue);
            }else {
                map.put(String.valueOf(s.charAt(i)), 1);
            }
        }
        System.out.println("Updated HashMap: " + map);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list based on values using a custom comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a new LinkedHashMap to preserve the insertion order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("sortedMap HashMap: " + sortedMap);
    }

    public static void substringOfStringIsPalindrome(String s){

        //Brute force approach
        int n = s.length();
        int ans = 0;
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                if(checkPalindrome(s, start, end)){
                    int length = end - start + 1;
                    ans = Math.max(ans, length);
                }
            }
        }
        System.out.println("Brute Force Approach "+ans);

    }

    public static boolean checkPalindrome(String s, int start, int end){
        int p1 = start;
        int p2 = end;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

}
