package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.*;
public class anagram {

    Scanner sc = new Scanner(System.in);
    static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
char[] firstWord = word1.toCharArray();
char[] secWord = word2.toCharArray();
 Arrays.sort(firstWord);
 Arrays.sort(secWord);
 return Arrays.equals(firstWord, secWord);
    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
System.out.print("Enter two words amd i'll tell you if they are anagrams: ");
String word1 = sc.nextLine();
String word2 = sc.nextLine();
 if(isAnagram(word1,word2) == true){
     System.out.print("\""+word1+"\" and \""+word2+"\" are anagrams.");
 }else
     System.out.print("\""+word1+"\" and \""+word2+"\" are not anagrams.");

    }
}
