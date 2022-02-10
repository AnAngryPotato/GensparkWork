import java.util.Scanner;
public class DragonCave
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        System.out.println("You are in a land full of dragons.  In front of you,");
        System.out.println("you see 2 caves.  In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you.  The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("which cave will you go into? (1 or 2)");
        choice = keyboard.nextInt();

        if (choice == 1 || choice == 2)
        {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky");
            System.out.println("A large dragon jumps out in front of you!  He opens his jaws and");

            if (choice == 1)
                System.out.println("gobbles you down in one bite!");
            else
                System.out.println("says \"'Sup little man.  Help yourself to some treasure.\"");
        }
        else
        {
            System.out.println("You do not approach either cave.  You stand there for a long time.");
            System.out.println("Legend says you are still standing outside the caves to this day.");
        }
    }
}
