import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Guess a number");
        Scanner scan = new Scanner(System.in);
        int numInput = scan.nextInt();
        int compGuess = (int) (Math.random() * 100 + 1);
        int tracker = 0;
        System.out.println("Answer is " + compGuess);

        //int guesscount = 0
        //if first guess, =guess count 0. or if input not equal to the previous guess they put,

        while (compGuess != numInput) {
            numInput = scan.nextInt();
            if (numInput > compGuess) {
                System.out.println("Your guess is too High! Try again");
                tracker++;
                System.out.println("Number of tries" + tracker);
            } else if (numInput < compGuess) {
                System.out.println("Your guess is too Low! try again");
                tracker++;
                System.out.println("Number of tries" + tracker);
            } else {
                System.out.println("Winner!! It took you " + tracker + " tries");
            }
        }
        System.out.println(numInput);
    }
}