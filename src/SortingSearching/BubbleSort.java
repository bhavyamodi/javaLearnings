package SortingSearching;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] Args){
        int[] nums = {1,5,4,2,0};
        int n = nums.length - 1;
        for(int i =0; i < n;i++){
            for(int j = 0; j < n-i; j++){
                //System.out.println("i "+i+" j "+j);
                if(nums[j] > nums[j +1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
