package com.company;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Pet snuggles = new Pet("calico","snuggles", LocalDate.of(2010,8,1));
        Pet blob = new Pet("green", "blob", LocalDate.of(2006, 2, 1));
        Scanner scan = new Scanner(System.in);
	// write your code here

        System.out.println("Choose a pet: 1. Snuggles, 2. Blob");
        int pick = scan.nextInt();

        if (pick == 1) {
            System.out.println(snuggles);
            System.out.println(snuggles.getName() + " is " + snuggles.getAge() + " years old.");
        }

        if (pick == 2) {
            System.out.println(blob);
            System.out.println(blob.getName() + " is " + blob.getAge() + " years old.");
        }
        if(pick != 1 || pick != 2) {
            System.out.println("Please choose 1 or 2");
        }
    }
}
