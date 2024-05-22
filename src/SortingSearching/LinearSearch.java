package SortingSearching;
import java.util.List;
public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1,5,58,78,45,5,89,4,4,5,4,4};
        int k = 78;

        System.out.println(search(nums, k));
    }

    public static int search(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k){
                return i;
            }
        }
        return -1;
    }
}
