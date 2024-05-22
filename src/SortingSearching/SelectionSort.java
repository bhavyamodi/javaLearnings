package SortingSearching;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {5,8,48,8,78,8,748,78,78,7,87,8,748,41,5415487,8,7485,4,847,7};
        int n = nums.length;
        for(int i =0; i < n ; i++){
            for(int j = i ; j < n; j++){
                if(nums[j] < nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
