 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;

 public class BMICal { public static void main(String[] args) throws IOException {
     float height, weight, result;

     BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Welcome to Smart BMI Calculator!");
     System.out.print("Please tell us how tall are you?(m) ");
     height = Float.parseFloat(BR.readLine());
     System.out.print("Great! Now tell us how light are you?(kg) ");
     weight = Float.parseFloat(BR.readLine());

     // We're using BMI = kg/m^2
     result = (float) (weight / Math.pow(height, 2));
     // System.out.println(result);
     if (result <= 16) {
         System.out.println("Starvation");
     } else if (result >= 16 || result <= 16.99) {
         System.out.println("Emaciation");
     } else if (result >= 17 || result <= 18.49) {
         System.out.println("Underweight");
     } else if (result >= 18.50 || result <= 22.99) {
         System.out.println("Normal weight, low range");
     } else if (result >= 23 || result <= 24.99) {
         System.out.println("Normal weight, high range");
     } else if (result >= 25 || result <= 27.49) {
         System.out.println("Overweight, low range");
     } else if (result >= 27.50 || result <= 29.99) {
         System.out.println("Overweight, high range");
     } else if (result >= 30 || result <= 34.99) {
         System.out.println("1st level of obesity");
     } else if (result >= 35 || result <= 39.99) {
         System.out.println("2nd level of obesity");
     } else if (result >= 40) {
         System.out.println("3rd level of obesity");
     }
 }
 }


