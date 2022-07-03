import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Guess a number");
//        Scanner scan = new Scanner(System.in);
//        int numInput = scan.nextInt();
//        int compGuess = (int) (Math.random() * 100 + 1);
//        int tracker = 0;
//        System.out.println("Answer is " + compGuess);
//
//        while (compGuess != numInput) {
//            numInput = scan.nextInt();
//            if (numInput > compGuess) {
//                System.out.println("Your guess is too High! Try again");
//                tracker++;
//                System.out.println("Number of tries" + tracker);
//            } else if (numInput < compGuess) {
//                System.out.println("Your guess is too Low! try again");
//                tracker++;
//                System.out.println("Number of tries" + tracker);
//            } else {
//                System.out.println("Winner!! It took you " + tracker + " tries");
//            }
//        }
//        System.out.println(numInput);
//    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int countTracker=0;  // this wil be used to count the number of tries
        int inputguess=0;         //used to not count the same number twice
        int previousguess = 0; //used to not count the same number twice
        int number = (int) (Math.random() * 100 + 1); //randomized number
        System.out.println("The answer is " +number);
        System.out.println("Enter a guess (from 0 to 100):");
        while (true){
            inputguess = scan.nextInt();
            if (inputguess == previousguess) {
                System.out.println("You already guessed this number. Try again!");
                continue;
            }
            else if (inputguess == number){
                countTracker++;
                System.out.println("Congratulation! You guessed the number in " + countTracker +" tries.");
                scan.close();
                break;
            }
            else if (inputguess < number){
                System.out.println("Your guess is too low.");
            }
            else if (inputguess > number) {
                System.out.println("Your guess is too high.");
            }
            countTracker++;
            previousguess=inputguess;
        }
    }
}