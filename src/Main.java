import Calci.Addition;
import Calci.Divide;
import Calci.Multiply;
import Calci.Subtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second number : ");
        double b = sc.nextDouble() ;

        System.out.println(Addition.add(a,b));
        System.out.println(Subtraction.subtract(a,b));
        System.out.println(Multiply.multiply(a,b));
        System.out.println(Divide.divide(a,b));

    }
}