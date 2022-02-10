import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args) {
        char c = 'y';
        int num;
        int guess = -1;
        int chances = 6;
        Random rng = new Random();
        String name;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        name = keyboard.nextLine();
        while (c == 'y')
        {
            System.out.println("Well, " + name + ", I'm thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            num = (rng.nextInt(20)) + 1;
            while (chances > 0)
            {
                guess = keyboard.nextInt();
                if (guess == num)
                {
                    System.out.println("Well done, " + name + ".  You guessed my number in " + (7 - chances)
                            + " guesses!");
                    chances = 0;
                }
                if (guess > num)
                {
                    chances--;
                    System.out.println("Your guess is too high.  You have " + chances + " guesses left.");
                }
                if (guess < num)
                {
                    chances--;
                    System.out.println("your guess is too low.  You have " + chances + " guesses left.");
                }
            }
            if (guess != num)
                System.out.println("Sorry, you're out of chances.  The number was " + num + ".");
            System.out.println("Would you like to play again?");
            c = keyboard.next().charAt(0);
            chances = 6;
        }
        System.out.println("Thanks for playing, " + name + "!");
    }
}
