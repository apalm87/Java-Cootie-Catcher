//imported utilities
import java.util.Scanner;

//Cootie Class
public class Cootie
{

    //Array of answers
    private String[] answers = {"Most likely.", "My sources say no.", "You may rely on it." ,
            "Better not tell you now.", "Cannot predict now.", "Yes – definitely.",
            "Don’t count on it.", "It is certain."};

    //variable for number choice
    private int choiceNum;

    //Cootie class instance of a scanner
    Scanner in = new Scanner(System.in);

    //odd method if red or green is selected
    public String odd()
    {
        String oddAns = "";//odd method variable

        do //do while loop to check for input
        {
            //try catch if input is not an integer
            try
            {
                System.out.print("Chose a number(1,2,5,6)");
                choiceNum = in.nextInt();
                //buffer
                in.nextLine();
                if (!(choiceNum == 1 || choiceNum == 2 || choiceNum == 5 || choiceNum == 6))
                {
                    System.out.println("Invalid Selection. Please Try again.");
                }
            }

            //if not an integer was inputed
            catch(Exception e)
            {
                System.out.println("Invalid Selection. Please Try again.");
                in.nextLine();
            }

        }while(!(choiceNum == 1 || choiceNum == 2 || choiceNum == 5 || choiceNum == 6));

        //subtracts array choice by 1 since array starts counting at 0
        choiceNum -= 1;
        //returning the value of the variable so it can be printed on the CootieCatcherMain class
        return answers[choiceNum];
    }

    //Even method if blue or yellow is selected
    public String even()
    {
        //odd method variable
        String evenAns = "";

        do //do while loop to check for input
        {
            //try catch if input is not an integer
            try
            {
                System.out.print("Chose a number(3,4,7,8)");
                choiceNum = in.nextInt();
                //buffer
                in.nextLine();
                if (!(choiceNum == 3 || choiceNum == 4 || choiceNum == 7 || choiceNum == 8))
                {
                    System.out.println("Invalid Selection. Please Try again.");
                }
            }
            //if not an integer was inputed
            catch(Exception e)
            {
                System.out.println("Invalid Selection. Needs to be a number. Please Try again.");
                in.nextLine();
            }
        }while(!(choiceNum == 3 || choiceNum == 4 || choiceNum == 7 || choiceNum == 8));

        //subtracts array choice by 1 since array starts counting at 0
        choiceNum -= 1;
        //returning the value of the variable so it can be printed on the CootieCatcherMain class
        return answers[choiceNum];
    }

}
