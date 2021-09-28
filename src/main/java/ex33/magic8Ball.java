package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Random;
import java.util.*;
public class magic8Ball {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your question?");
        String question = sc.nextLine();
        Random rand = new Random();
        int responseNum = rand.nextInt(4);
        int num= responseNum;
        String response;
        switch (num){
            case 1: response = "\nYes";
                break;
            case 2: response = "\nNo";
                break;
            case 3: response = "\nMaybe";
                break;
            default: response = "\nAsk again later";
                break;
        }
        System.out.println(response);
    }
}
