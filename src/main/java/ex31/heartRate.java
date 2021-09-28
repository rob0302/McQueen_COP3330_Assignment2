package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.*;
public class heartRate {

static void TargetHeartRate(int age , int restingHeart ){

     System.out.print("Intensity   |  Rate    \n");
     System.out.print("------------|----------");
for(int intensity = 55;intensity<=95;intensity += 5) {
    int targetHeartRate = (((220 - age) - restingHeart) * intensity / 100 ) + restingHeart;
     System.out.print("\n"+intensity+"%         | "+targetHeartRate+" bpm");
}

}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age : ");
    int age = sc.nextInt();
    System.out.print("Enter resting heart rate : ");
    int heartRateRest = sc.nextInt();
    TargetHeartRate(age,heartRateRest);
    }
}
