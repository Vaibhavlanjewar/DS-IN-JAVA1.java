/*
 Non Repeating Character
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Note : When you return '$' driver code will output -1.

Examples:

Input:
s = hello
Output: h
Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other 'h' in the string.
Input:
s = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is the character which is non-repeating. 
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Number of distinct characters).
Note: n = |S|

Constraints:
1 <= n <= 105

https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
 */

import java.util.HashMap;
import java.util.Scanner;

public class q39_Non_repeating_character {
    public static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:S.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:S.toCharArray()){
            if(mp.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(nonrepeatingCharacter(str));
   }
}