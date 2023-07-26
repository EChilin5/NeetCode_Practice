package Arrays_Hashing;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // base case is true if the word is a valid anagram
        // another case is to check if strings are equal if not return false

        // use a hashmap to keep record of s
        // where each letter will be the key
        //and the integer will be the counter of times of occurance
        // use a seperate int to keep track of the number left


        int sLength = s.length();
        int tLength = t.length();
        HashMap<Character, Integer> map = new HashMap<>();

        if(sLength != tLength){
            return false;
        }

        for(int i = 0; i < sLength; i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) +1);
            }else{
                map.put(temp, 1);
            }
        }

        for(int i = 0; i < tLength; i++){
            char temp = t.charAt(i);
            if(map.containsKey(temp) && map.get(temp) != 0){
                map.put(temp, map.get(temp)-1);
            }else{
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
