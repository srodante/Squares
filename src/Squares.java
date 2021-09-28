/*
 This program will take the users input and display numbers from 1 to the input
 number with the numbers squared
 */
import java.util.Scanner;

public class Squares {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int userInput, squared;

        System.out.println("Enter a number: ");
        userInput = input.nextInt();

        System.out.println("Number            Square"); //Don't know of a tab command
        System.out.println("_________       __________");
        for (int i = 1; i <= userInput; i++){
            squared = i;
            System.out.println(i + "                      " + (squared *= squared));
        }
    }
}
