import java.util.Scanner;
public class DevTest {
    void main(){
        Scanner pipe = new Scanner(System.in);

/*
  String nonZeroString = SafeInput.getNonZeroLenString(pipe,"You've been prompted");
     System.out.println("You entered: " + nonZeroString);

        int int1 = SafeInput.getInt(pipe, "Number please");
        System.out.println("You entered: " + int1);


        double double1 = SafeInput.getDouble(pipe, "Decimal please");
        System.out.println("You entered: " + double1);

         int numRange = SafeInput.getRangedInt(pipe, "Enter a number between", 12, 20);
         System.out.println("You entered: " + numRange);

         double numRange2 = SafeInput.getRangedDouble(pipe, "Enter a number between", 3.2, 40.8);
         System.out.println("You entered: " + numRange2);

        boolean yesNo = SafeInput.getYNConfirm(pipe, "Would you like to test this code?");
        if(yesNo == true){
            IO.println("Thank you for testing this code!");
        }else if(yesNo == false){
            IO.println("Thank you for answering then.");
        }

 */
    String getReg = SafeInput.getRegExString(pipe, "Please enter your phone number (XXX)-XXX-XXXX", "%3d-\\%3d-\\%4d$");
    IO.print(getReg);

    }
}
