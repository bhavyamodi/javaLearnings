package SortingSearching;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] nums = {5,52,7,89,55,484,48,64,2};
        int n = nums.length;
        for(int i =0; i < n;i++){
            int index = 0;
            while(index < i){
                if(nums[index] > nums[i]){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
                index++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
