package com.mycompany.act4_albino_3;

import java.util.Scanner;

public class ACT4_Albino_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your father's name: ");
        String FatherName = in.nextLine();
        System.out.print("Enter your mother's name: ");
        String MotherName = in.nextLine();
        System.out.print("Enter how many years your parents have been married: ");
        int MarriedYears = in.nextInt();
        System.out.print("Enter the number of their children: ");
        int NoOfChildren = in.nextInt();
        
        System.out.println(FatherName + " and " + MotherName + " are married for " + MarriedYears + " years " + "and they have " + NoOfChildren + " children.");
        
    }
}
