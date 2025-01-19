package datastructurealgo.arrays;

import java.util.HashSet;

/**
 * The ContainsDuplicate class provides a utility method to determine
 * whether a given array of integers contains any duplicate elements.
 */
public class ContainsDuplicate {

        public static boolean containsDuplicate(int[] nums){
            HashSet<Integer> set = new HashSet<>();

            for(int num : nums){
                if(set.contains(num))
                    return true;
                set.add(num);
            }
            return false;
        }

        public static void main(String[] args) {
            int[] nums = {1,2,3,1};
            boolean result = containsDuplicate(nums);
            System.out.println(result);
        }
}
