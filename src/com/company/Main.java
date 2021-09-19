package com.company;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static CharacterIteratorWrapper scan;

    public static void main(String[] args) {

        String answer;
        do {
            Pattern p = Pattern.compile("\\d+d\\d+");
            Scanner input1 = new Scanner(System.in);
            System.out.println(" Please enter number of dice and side you want to roll ? (enter in format of XDY . X is the number of dice and Y is the number sides.)");
            String str = input1.nextLine();
            while (!p.matcher(str).matches()) {
                System.out.println("Input is not valid. Please enter a new input");
                str = input1.nextLine();
            }
            int numDice = Integer.parseInt(str.split("d")[0]);
            int numSides = Integer.parseInt(str.split("d")[1]);
            int total = 0;
            int[] dice = new int[numDice];
            for (int i = 0; i < numDice; i++) {
                Random rand1 = new Random();
                ;
                dice[i] = rand1.nextInt(numSides) + 1;
            }

            String msg = "";
            for (int die : dice) {
                msg += "You rolled a " + die + " on a " + numSides + " sided dice\n";
                total += die;
            }
            System.out.println(msg);
            System.out.println("Your total is " + total);


            Scanner input2 = new Scanner(System.in);
            System.out.println("Do you want to continue  rolling ? (Yes/N0)");
            answer = input2.next();
           // char a = scan.next();
           // answer= String.valueOf(scan.next());

        } while (answer.equalsIgnoreCase("yes"));
    }
    }


