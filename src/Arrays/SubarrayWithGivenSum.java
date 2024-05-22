package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSum {
    public static void main(String[] args){
        int[] arr = {0,1,2};
        int n = 3;
        int s = 1;
        System.out.println(bruteForce(arr,n,s));
        System.out.println(twoPointer(arr,n,s));


    }

    public static ArrayList<Integer> bruteForce(int[] arr, int n, int s){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < n; i++){
            int sum = arr[i];
            if(sum == s){
                result.add(1);
                result.add(1);
                return result;
            }
            for(int j = i + 1; j < n; j++){
                sum += arr[j];
                if(sum == s){
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }
        }
        result.add(-1);
        return result;
    }

    public static ArrayList<Integer> twoPointer(int[] arr, int n, int s){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = 0;
        int currentSum = 0;
        while(right < n){
            currentSum += arr[right];
            //System.out.println("currentSum before "+currentSum+" left index "+left+" right index "+right);
            while(currentSum > s && left < right){
                currentSum -= arr[left];
                left++;
            }
            //System.out.println("currentSum after "+currentSum+" left index "+left+" right index "+right);

            if(currentSum == s){
                result.add(left+1);
                result.add(right+1);
                return result;
            }
            right++;
        }
        result.add(-1);
        return result;
    }
}
