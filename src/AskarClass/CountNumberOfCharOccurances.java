package AskarClass;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharOccurances {
//    create a program which will calculate the number of occurances of each character in a String.

public static void main(String[] args) {
    Map<Character, Integer> numOfOccurance = new HashMap<>();
    String str = "pineapple";
    for(int i =0; i <str.length(); i++){
        if(!numOfOccurance.containsKey(str.charAt(i))){ // if map doesnt contain the char then add the char as a key
            numOfOccurance.put(str.charAt(i), 1);// 1 is value of first occurance of the char
        }else{ // if map contains the char in the keys then update it's value
            int a = numOfOccurance.get(str.charAt(i)); // get the value for the key
            numOfOccurance.put(str.charAt(i),a+1); // 1 is adding to values
        }
    }
    System.out.println(numOfOccurance);
}
}
