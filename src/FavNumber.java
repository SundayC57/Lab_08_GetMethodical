import java.util.Scanner;
public class FavNumber {

    public static void main(String[] args)
    {
        Scanner pipe =  new Scanner(System.in);
        int favInt = SafeInput.getInt(pipe, "Enter your favourite integer");
        pipe.nextLine();
        double favDouble = SafeInput.getDouble(pipe, "Enter your favourite double");
        IO.println("Your favourite integer is: " + favInt);
        IO.println("And your favourite double is: " + favDouble);
    }
}
