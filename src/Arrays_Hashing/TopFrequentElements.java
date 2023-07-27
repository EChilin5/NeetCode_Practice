package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TopFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // first create a method to create a counter that will record the number of occurances
        // for each value
        // use hashmap to keep record of each value occurance
        // create an empty array base on the number of k elements

        // then find the max values for each

        /// 1, 1, 1, 2, 2, 3
        // 1 | 3
        // 2 | 2
        // 3 | 1
        // so 1 and 2 will be returned

        int max = 0;
        int hotKey = 0;
        int[] top = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int number : nums) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for(int i = 0; i < top.length; i++){
            for(Integer key : map.keySet()){
                int count = map.get(key);
                if(count > max){
                    max = count;
                    hotKey = key;
                }
            }
            top[i] = hotKey;
            map.remove(hotKey);
            max = 0;
            hotKey = 0;

        }




        return top;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(array,2)));

    }

}
