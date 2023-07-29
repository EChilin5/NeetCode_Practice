package Arrays_Hashing;

import java.util.Arrays;

public class productExceptSelf {

    public static int[] ProductExceptSelf(int[] nums) {

        // find the value of the array without using division
        // 0 (n) requirement
        // first find the prefix value of the array first by multiply the first value by 1
        // for example prefix array
        // 1  * (prefix) 1 => array[0] = 1
        // 1 * (prefix) 1 =>array[1] = 1
        // 2 * prefix 1 =>array[2] = 2
        // 3 * (prefix) 2 -> array[3] = 6
        // after finding all prefix values than the values will be obtained by multiplying by it's postfix
        // postfix will be 1 at the start
        // starting in reverse for array
        /// post --> 1
        // 6  * (postfix) 1 => array[3] = 6
        /// post --> 1*4
        // 2 * (postfix) 4 =>array[2] = 8
        /// post--> 4 x 3
        // 1 * ()postfix) 12 =>array[1] = 12
        // post -->12 * 2
        // 1 * (postfix) 24 -> array[0] = 24


        int[] result = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        // first value will be 1 * 1 as there is no value before

        for(int i= 0; i < nums.length; i++){
            result[i] = prefix;
            //multiply by each previous value
            prefix = prefix *  nums[i];

        }

        for(int i = nums.length-1; i >=0;i--){
            result[i] = result[i] * postfix;
            postfix = postfix *nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(ProductExceptSelf(array)));
    }
}
