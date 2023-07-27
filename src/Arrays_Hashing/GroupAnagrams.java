package Arrays_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs){
        // create a key using each character in the set
        // key will be specific ascii value that will be associated
        // with each word
        // value of the string will be the specific words with those characters
        // using hash[current - a] will provide the ascii value/key

        // return a list of string array with each unique character combination

        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        // base case when string is empty
        if(strs.length == 0){
            return res;
        }

        for(String s: strs){
            char[] hash = new char[26];
            for(char c: s.toCharArray()){
                // b - 'a'
                // 98 - 97 -> 1
                // hash[b - 'a']++ -> will be location 2 in the array
                // continuosly increase value by adding all chars in string
                // which will create the unique key
                hash[c-'a']++;

            }

            String key = new String(hash);
            // initiaite a new hash map with an empty arraylist when key does not exist
            map.computeIfAbsent(key, emptyList ->new ArrayList<>());
            map.get(key).add(s);
        }

        res.addAll(map.values());
        return res;

    }

    public static void main(String[] args) {
        String[] array = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(array);
        System.out.println(Arrays.toString(lists.toArray()));

    }
}
