import java.util.Scanner;
public class CheckOut {
    public static void main() {
        boolean done = true;
        Scanner pipe = new Scanner(System.in);
        double total = 0;

        do{
            double price = SafeInput.getRangedDouble(pipe,"Enter the price of your item:", 0.50, 10.00);

            total = price + total;

            IO.print("Your total is currently: $" + total);
            pipe.nextLine();
            done = SafeInput.getYNConfirm(pipe, "\nWould you like to continue adding items?");

        }while(done);


        IO.print("Your final total is:");
       System.out.printf("\s%.2f", total);
    }
}
