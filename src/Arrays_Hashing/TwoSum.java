package Arrays_Hashing;

import java.util.HashMap;

public class TwoSum {

    public  static int[] twoSum(int[] nums, int target) {
        // use a hashmap to find target value
        // key will be first integer and the value will be the result of target - value
        // 2 7 11 15
        // target is 9
        // 9-2 = 7
        // return values once found else return empty array
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)    ){
                return new int[]{map.get(temp), i};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args){
        int[] test = new int[]{2,7,11,15};
        int[] array = twoSum(test,9);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
