/*
 * Name:Lisbet Bautista
 * Date: 9/21/25 @ 11:59pm
 * Version: v1
 * SOURCES USED: chatgpt <- but only to check why some SECTIONS of my code for why was not working.
 * Comment: After an operation that works for a spicifice part of the code You will write a Comment
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // will be needed for all the inputs of the user
    Random random = new Random(); // this will be needed as well for the Random numbers

    // This is when the Enter name will start
    System.out.println("Enter Character name:  ");
    String charactername = input.nextLine();

    // Prints out the Instructions on what excactly will the user be doing
    System.out.print("Lets Get Started " + charactername + ", Welcome To Number Guessing Game, In this Game you will have to Guess a number between 1–100.\n" +
        "But know that this game won't be EASY! You will only have (5 lives) to Guess correctly,\n" +
        "I will help you if your number is getting closer by saying HIGHER or LOWER. Now Lets Get Started,");

  // Gennerating a random number from 1-100, it will not show
    int randomNumber = random.nextInt(100) + 1;

    int lives = 5; /*This is for the lives */

    //if the user guesses this correctly then it will come out as false
    boolean Correct = false;

    while(lives > 0){ //I used while for it to loop

          System.out.println("Enter your guess:(" + lives +" LIVES LEFT):"); /*  this is what pops up when the lives are getting lower*/
          String Userinput = input.nextLine();
          int guess; 

          guess = Integer.parseInt(Userinput);// This is where the users guess is basedin order to determend in the if/else 

          //This is just to let the user Know that if they wanted to input a number the is not between "1-100" that they will 
          //get this message 
        if (guess < 1 || guess > 100){
          System.out.println("Please guess between 1-100");
        }
        
        // this would be where all my number guessing would be to to determend if its "LOWER", "HIGHER", "OR THE SAME"

        if (guess == randomNumber) {
          System.out.println("CONGRATULATION!!! YOU GOT IT CORRECT " + randomNumber + " Was the right Answer");
          Correct = true;
        } else if(guess < randomNumber){
           System.out.println("HIGHER!!!" );
          Correct = false; 
        }else if(guess > randomNumber){
           System.out.println("LOWER!!!" );
           Correct = false; 
        } else{
           System.out.println("error!!!" );
        }
        lives --;

        if (lives <= 0){
          System.out.println("lives eliminated 😵, SORRY the corrcet ansewer was " + randomNumber);
        }

    }

    input.close();

  }
}


