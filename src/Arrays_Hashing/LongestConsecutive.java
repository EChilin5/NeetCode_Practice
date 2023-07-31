package Arrays_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {

    public static int longestConsecutive(int[] array){

        // GET THE COUNTER FOR THE LONGEST CONSECUTIVE INTEGERS
        // 100 , 4, 232, 3,2,1
        // a way to solve this is to either sort out the array and have
        // a seperate counter to loop check for the highest consecutive counter
        // store values in a hashset
        // have a sepearted method that will act as a counter to check for the max consecutive
        // where each value in the set will be checked for it's next value if present
        // or break
        // add an additional check if the current value -1 exist (resolved a test case for large arrays)


        HashSet<Integer> set = new HashSet<>();
        int longestCounter = 0;

        for (int j : array) {
            set.add(j);
        }
        for(int value:set){
            if(!set.contains(value-1)){
                int counter = 1;
                int currentValue = value;
                while(set.contains(currentValue+1)){
                    counter++;
                    currentValue++;
                }
                longestCounter =Math.max(longestCounter, counter);
            }
        }
        return longestCounter;
    }

    public static void main(String[] args) {
        int[] array = new int[]{100,3,4,55,3,2,1};
        System.out.println(longestConsecutive(array));
    }


}
