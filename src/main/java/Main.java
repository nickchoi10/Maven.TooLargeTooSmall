import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Guess a number (2nd guess is your first try to start this game off lol");
        Scanner scan = new Scanner(System.in);
        int numInput = scan.nextInt();
        int compGuess = (int)(Math.random()*100+1);
        int tracker = 0;

        while (compGuess != numInput){
            numInput = scan.nextInt();
            if (numInput>compGuess){
                System.out.println("Your guess is too High! Try again");
            tracker++;
            System.out.println(tracker +"tries");}
            else if (numInput<compGuess){
                System.out.println("Your guess is too Low! try again");
            tracker++;
            System.out.println(tracker + "tries");}
            else {
                 System.out.println("Lets go!!!!It only took you this many tries" + tracker);

            break;

        }

        }

        System.out.println(numInput);








    }
}
