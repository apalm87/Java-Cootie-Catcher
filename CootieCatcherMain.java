//imported utilities
import java.util.Scanner;

//Main Class
public class CootieCatcherMain
{

    //Main Method
    public static void main (String[] args)
    {

        //instance of a scanner for question
        Scanner in = new Scanner(System.in);

        //variable for question input
        String question = "";
        String playAgain = "";

        //do while loop if user wants multiple plays.
        do
        {
            //user input for user question
            System.out.println("Cootie Catcher");
            System.out.print("Ask your Cootie Catcher a question: ");
            question = in.nextLine();

            //call make choice method in CootieCatcherMain
            makeChoice();

            //Option if user wants to play again.
            System.out.println();
            System.out.println("Would you like to play again? Press any key to continue or q to quit");
            playAgain = in.nextLine();

        }while(!playAgain.equalsIgnoreCase("q"));
    }

    //Make Choice method
    public static void makeChoice()
    {
        //instance of the Cootie class
        Cootie you = new Cootie();

        //instance of a scanner for the make choice method
        Scanner in = new Scanner(System.in);

        //variable for color choice input
        String colorChoice = "";

        //do while loop to check for invalid input
        do {

            //input for color choice.
            System.out.print("Chose a color(red, yellow, green, blue): ");
            colorChoice = in.nextLine();

            //if input is either red or green
            if (colorChoice.equalsIgnoreCase("red") ||
                    colorChoice.equalsIgnoreCase("green"))
            {
                System.out.println(you.odd());//call the odd method in Cootie Class
            }

            //if input is either blue or yellow
            else if (colorChoice.equalsIgnoreCase("blue") ||
                    colorChoice.equalsIgnoreCase("yellow"))
            {
                System.out.println(you.even()); //call the even method in Cootie Class
            }

            //if input is invalid
            else
            {
                System.out.println("Invalid selection, please try again");
            }

        }while(!(colorChoice.equalsIgnoreCase("red") ||
                colorChoice.equalsIgnoreCase("green") ||
                colorChoice.equalsIgnoreCase("blue") ||
                colorChoice.equalsIgnoreCase("yellow")));

    }

}

