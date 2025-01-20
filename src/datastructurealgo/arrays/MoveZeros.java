package datastructurealgo.arrays;

/*
Given an integer array,
move all elements that are 0 to the left while maintaining the order of other elements in the array.
The array has to be modified in-place
 */

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        for(int i : nums){
            System.out.println(i);
        }
        moveZeroesToLeft(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
    public static void moveZeroesToLeft(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = j; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
