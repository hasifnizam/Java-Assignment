package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHi! This is Kata Words Counter. Please Insert The Text Below..." );
        System.out.print("Enter Text: ");
        
        String userInput = scanner.nextLine();
        words.setText(userInput);

        Holding hold = new Holding();

        hold.StartHold(words.getText());

        scanner.close();
    }
}
