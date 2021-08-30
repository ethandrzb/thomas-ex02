/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ethan Thomas
 */

import java.util.Scanner;

public class Solution02
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the input string? ");

        String input = sc.nextLine();

        System.out.println(charCount(input));

        System.exit(0);
    }

    public static String charCount(String str)
    {
        return str + " has " + str.length() + " characters.";
    }
}
