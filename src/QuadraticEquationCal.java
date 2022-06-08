import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class QuadraticEquationCal { public static void main(String[] args) throws IOException {
    float a, b, c, x1, x2, root;
    char rootsNumber = 0;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Welcome to simple Equation Calculator!");
    System.out.print("Please, enter your first value here: ");
    a = Float.parseFloat(BR.readLine());

    if (a == 0) {
        System.out.print("First value must not equal to 0!");
    } else {
        System.out.print("Please, enter your second value here: ");
        b = Float.parseFloat(BR.readLine());
        System.out.print("Please, enter your third value here: ");
        c = Float.parseFloat(BR.readLine());

        root = (float) Math.pow(b, 2) - 4 * a * c;

        if (root < 0)
            rootsNumber = 0;
        if (root == 0)
            rootsNumber = 1;
        if (root > 0)
            rootsNumber = 2;

        switch (rootsNumber) {
            case 0:
                System.out.println("There are not real roots");
                break;
            case 1:
                x1 = -b / (2 * a);
                System.out.printf("For a = " + "%4.2f,", a);
                System.out.printf(" b = " + "%4.2f,", b);
                System.out.printf(" c = " + "%4.2f,", c);
                System.out.print("the trinomial has one double root = ");
                System.out.printf("%4.2f.\n", x1);
                break;
            case 2:
                x1 = (-b - (float) (Math.sqrt(root))) / (2 * a);
                x2 = (-b + (float) (Math.sqrt(root))) / (2 * a);
                System.out.printf("For a = " + "%4.2f,", a);
                System.out.printf(" b = " + "%4.2f,", b);
                System.out.printf(" c = " + "%4.2f. \n", c);
                System.out.print(" x1 = ");
                System.out.printf("%4.2f.\n", x1);
                System.out.print(" x2 = ");
                System.out.printf("%4.2f. \n", x2);
                break;
        }
    }
}
}
