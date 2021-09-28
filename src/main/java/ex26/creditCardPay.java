package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import static java.lang.Math.log;
import java.util.*;
public class creditCardPay {
    static double creditPay(int APR, double balance, double payment){
        int monthInterest = (APR / 100) / 365;

        double monthsNotRounded;
        monthsNotRounded = -(1/30) * log(1 + (balance / payment) * (1 - (1 + monthInterest) ^ 30)) / log(1 + monthInterest);
/*
        if(monthsNotRounded % 2 == 0) {
            return (int)monthsNotRounded;
        }
        else
            return (int)monthsNotRounded + 1;
*/
        return  monthsNotRounded;
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int Apr;
double bal, pay;
System.out.print("What is your balance? ");
bal = sc.nextDouble();
System.out.print("What is your APR on the card (as a percent)? ");
Apr = sc.nextInt();
System.out.print("What is the monthly payment you can make? ");
pay = sc.nextDouble();


 System.out.print("It will take you "+ creditPay(Apr, bal, pay)+" months to pay off this card");
    }
}
