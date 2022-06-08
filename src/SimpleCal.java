import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.io.IOException;

public class SimpleCal {public static void main(String[] args) throws IOException {
    float firstNumber, secondNumber;

    // Declaring array for each result and operation names.
    float[] result = new float[4];
    String[] operator = new String[] { "by summing", "by difference",
            "by product", "by quotient" };

    DecimalFormat df = new DecimalFormat("0.00");

    // Declaring reader from user.
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    // Welcoming message and asking user to type down the numbers.
    System.out.println("Welcome to simple calculator!");
    System.out.print("Enter your first number: ");
    firstNumber = Float.parseFloat(BR.readLine());
    System.out.print("Enter your second number: ");
    secondNumber = Float.parseFloat(BR.readLine());

    // Calculation starts here.
    System.out.println(String.format("%s, %s", firstNumber, secondNumber));
    result[0] = firstNumber + secondNumber; // Plus
    result[1] = firstNumber - secondNumber; // Minus
    result[2] = firstNumber * secondNumber; // Multiplication
    result[3] = firstNumber / secondNumber; // Division

    // Log out the result.
    for (int i = 0; i < result.length; i++) {
        System.out.println(String.format("Your result %s is %s", operator[i], df.format(result[i])));
    }
}
}
