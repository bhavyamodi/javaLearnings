package SortingSearching;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {1,5,58,78,89,94,104,255,674,784};
        int k = 784;
//        System.out.println(search(nums, k));

        int[] nums1 = {1,3,8,9,15,16};
        int[] nums2 = {7,11,18,19,21,25};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static int search(int[] nums, int k){
        int low = 0;
        int high = nums.length;
        while(low < high){
            int median = (low + high) / 2;
            if(k == nums[median]){
                return median;
            }
            if(k < nums[median]){
                high = median;
            }
            else{
                low = median;
            }
        }
        return -1;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n){
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0;
        int high = m;
        while(low <= high){
            int mid1 = (low + high) / 2;
            int mid2 = (m + n + 1) / 2 - mid1;
            System.out.println("mid1 "+mid1+" mid2 "+mid2);
            int minLeft1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int maxRight1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];

            int minLeft2 = (mid2 == 0) ? Integer.MIN_VALUE :nums2[mid2 - 1];
            int maxRight2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            // ideal scenario :
            // minLeft1 <= maxRight2
            // minLeft2 <= maxRight1
            // Median Even = avg(max(minLeft1, minLeft2), min(maxRight1, maxRight2))
            // Median Odd = (max(minLeft1, minLeft2))

            System.out.println("minLeft1 "+ minLeft1 +" maxRight1 "+maxRight1);
            System.out.println("minLeft2 "+ minLeft2 +" maxRight2 "+maxRight2);

            if(minLeft1 <= maxRight2 && minLeft2 <= maxRight1){
                if ((m + n) % 2 == 0) {
                    return (Math.max(minLeft1, minLeft2) + Math.min(maxRight1, maxRight2)) / 2.0;
                } else {
                    return Math.max(minLeft1, minLeft2);
                }
            }else if(minLeft1 > maxRight2){
                high = mid1 - 1;
            }else{
                low = mid1 + 1;
            }
        }
        return -1.0;
    }
}
