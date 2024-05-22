package SortingSearching;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int[] nums = {5,58,48,4,-15,-584,54,-54,-5,154,-54848,-58,55,598,154,15};
        int lb = 0;
        int ub = nums.length - 1;
        merge(nums, lb,ub);

    }
    public static void merge(int[] nums, int lb, int ub){
//        System.out.println("lb "+lb+" ub "+ub);
        if(lb<ub){
            int mid = (lb+ub)/2;
            merge(nums, lb, mid);
            merge(nums, mid+1, ub);
            mergeSort(nums, lb, mid,ub);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums,int lb,int mid,int ub){
//        System.out.println("lb "+lb+" ub "+ub+" mid "+mid);
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
//        System.out.println("n1  "+n1+" n2 "+n2);
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = nums[lb + i];
        for (int j = 0; j < n2; ++j)
            R[j] = nums[mid + 1 + j];

        int i = 0, j = 0;

        int k = lb;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
}
