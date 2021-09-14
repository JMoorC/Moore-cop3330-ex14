/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex14 {

    static final double WITAX = 0.055;

    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double inAmount = roundWholeCent(inScan.nextDouble());

        System.out.print("What is the state? ");
        String state = inScan.next().toLowerCase();
        String answer = "";

        if(state.equals("wi") || state.equals("wisconsin")){
            System.out.printf("The subtotal is $%.2f.\n", inAmount);
            double tax = roundWholeCent(inAmount * WITAX);
            answer = String.format("The tax is $%.2f.\n", tax);
            inAmount += tax;
        }

        answer = answer + String.format("The total is $%.2f.",inAmount);
        System.out.println(answer);
    }

    public static double roundWholeCent(double value){
        int hold = (int) (value * 1000000);
        return Math.ceil( (hold / 10000.0) ) / 100.0;
    }

}
