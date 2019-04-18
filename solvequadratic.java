import java.util.Scanner;
import java.lang.Math; //importing the java.lang package

public class solvequadratic {
    public static void main(String[] args) {
        double a, b, c, d, x, x1, x2;
        //Input a, b, c 
        Scanner in = new Scanner(System.in); //Scan the keyboard for input
        in.close();

        System.out.println("Your quadratic equation must be in the following form: a(x^2) + b(x) + c = 0");
        System.out.print("Enter the value of a: ");
        a = in.nextDouble();

        System.out.print("Enter the value of b: ");
        b = in.nextDouble();

        System.out.print("Enter the value of c: ");
        c = in.nextDouble();
        


        //Calculating d
        d = Math.pow(b, 2) - (4*a*c);
        if (d < 0) {
            System.out.println("No real roots!");

        } else if (d == 0) {
            x = ((-b)/(2*a));
            System.out.println("Equal roots! x = " + x);
        } else {
            //Quadratic formula
            x1 = (((-b) + Math.sqrt(d)) / (2 * a));
            x2 = (((-b) - Math.sqrt(d)) / (2 * a));
            System.out.println("Roots are: " + x1 + ", " + x2);
        }
    

    }
}