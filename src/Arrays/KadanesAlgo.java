package Arrays;

public class KadanesAlgo {
    public static void main(String[] args){
        int[] arr = {-10,-2,-3,-4};
        int n = 4;
        System.out.println(bruteForce(arr,n));
    }

    public static long bruteForce(int[] arr, int n){
        long sum = arr[0];
        long currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            if(sum < currentSum){
                sum = currentSum;
            }
        }
        return sum;
    }
}
