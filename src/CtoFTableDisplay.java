import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args) {
        SafeInput.prettyHeader("Celcius to Farenheit");
        Double x = -100.0;
        String empty = "                                ";


        do {

            Double y = CtoF(x);

            System.out.println();

            System.out.printf("\t%.6s\t%5sC\t%.17s\t%.6sF\n", empty, x, empty,y, empty);

            x++;
        }while(x <= 100);

        for(int i = 0; i <= 60; i++){
            IO.print("*");
        }
    }

    public static double CtoF(double Celsius)
        {
        double f = 0;
            f = (Celsius * 9/5) + 32;
        return f;
        }
}
