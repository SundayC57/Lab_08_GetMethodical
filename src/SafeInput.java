import java.util.Scanner;
public class SafeInput {
Scanner pipe = new Scanner(System.in);


    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt){
        boolean done = false;
        int retInt = 0;
        String trash = " ";

        do{
            IO.print(prompt + ": ");

            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                done = true;
            }else{
                trash = pipe.nextLine();
                System.out.println("You need to enter a valid integer not: " + trash);
                done = false;
            }
        }while(!done);

        return(retInt);
    }

    public static double getDouble(Scanner pipe, String prompt){
        boolean done = false;
        double retDouble = 0;
        String trash = " ";

        do{
            IO.print(prompt + ": ");

            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                done = true;
            }else{
                trash = pipe.nextLine();
                System.out.println("You need to enter a valid number not: " + trash);
                done = false;
            }
        }while(!done);

        return(retDouble);
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
       int retRange = 0;
       boolean done = false;
       String trash = " ";
       int userNum = 0;


        do{
            System.out.println("Please enter a number between "+ low + " and " + high +": " );

            if(pipe.hasNextInt()) {
                userNum = pipe.nextInt();
                if(userNum >= low && userNum <= high) {
                    done = true;
                }
                else{
                    IO.println("You guessed a number out of range: " + userNum + " Try again!");
                    done = false;
                }

            }
            else
            {
                trash = pipe.nextLine();
                IO.println("You entered an invalid input: " + trash + " Please try again and enter a number [" + low + "-" + high + "]");
            }


        }while(!done);


        return(retRange);
    }

}
