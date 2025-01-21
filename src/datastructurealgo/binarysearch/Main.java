package datastructurealgo.binarysearch;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 17;

        int index = binarySearch(nums, target);

        if (index == -1) {
            System.out.println("Target not found");
        }else{
            System.out.println("index: " + index);
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            // check if the target is at the middle
            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) { // If the target is larger, ignore the left half
                left = mid + 1;
            } else {
                right = mid - 1; // If the target is smaller, ignore the right half
            }
        }

        // Target not found
        return -1;
    }
}
