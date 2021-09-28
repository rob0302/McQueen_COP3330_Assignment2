package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.*;
public class addingNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int numbers=0;
for(int i =0;i<5;i++){
    System.out.print("Enter a number: ");
    int newNumber = sc.nextInt();
    numbers += newNumber;

}
System.out.print("The sum is "+ numbers);
    }

}
