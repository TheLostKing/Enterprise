package com.example;

import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

public class selfDestruct {
    public static void main(String[] args)
    {
        String Code1 = "11A", Code2 = "112AB", Code3 = "1B2B3", Rank1 = "Captain", Rank2 = "First Officer", Rank3 = "Chief Engineer", input = "";
        Scanner scan = new Scanner(System.in);
        Timer time = new Timer();

        do {
            System.out.print("Please enter your order: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase("Initiate sequence one: Self Destruct")) {
                System.out.println("Invalid order");
            }
        }
        while(!(input.equalsIgnoreCase("Initiate sequence one: Self Destruct")));

        do {
            System.out.print("Please enter your rank: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Rank1)) {
                System.out.println("Invalid Rank");
            }
        }
        while(!input.equalsIgnoreCase(Rank1));

        do {
            System.out.print("Please enter code 1: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Code1)) {
                System.out.println("Invalid code");
            }
        }
        while(!input.equalsIgnoreCase(Code1));

        do{
            System.out.print("Please enter your rank: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Rank2)) {
                System.out.println("Invalid Rank");
            }
        }
        while(!input.equalsIgnoreCase(Rank2));

        do{
            System.out.print("Please enter code 2: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Code2)) {
                System.out.println("Invalid code");
            }
        }
        while(!input.equalsIgnoreCase(Code2));

        do{
            System.out.print("Please enter your rank: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Rank3)) {
                System.out.println("Invalid Rank");
            }
        }
        while(!input.equalsIgnoreCase(Rank3));

        do{
            System.out.print("Please enter code 3: ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase(Code3)) {
                System.out.println("Invalid code");
            }
        }
        while(!input.equalsIgnoreCase(Code3));
        System.out.println("Self Destruct Sequence Activated");

        for(int i = 20; i > 0; i-- )
        {
            System.out.println(i + "second(s) left");
        }
        System.out.println("BOOM!");


    }
}
