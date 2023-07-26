package Arrays_Hashing;

import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        // check if array contains duplicate
        // use hashset to check for duplicates
        // as set or hashset can not have duplicate keys
        // if item in array appears in key again return true
        // base case return false if items are distinct

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++ ){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,1};
        System.out.println(containsDuplicate(array));
    }
}
