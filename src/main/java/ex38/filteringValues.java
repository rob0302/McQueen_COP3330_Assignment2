package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.*;
public class filteringValues {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by a list: ");
        String nums = sc.nextLine();

        int[] numArray = new int[nums.length()];

        for (int i=0;i < nums.length();i++){
            numArray[i] = nums.charAt(i);

        }
for(int i =0;i < nums.length();i++){
    System.out.print("\n"+numArray[+i]);
}
    }

}
