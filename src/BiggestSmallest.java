import java.lang.Math;

public class BiggestSmallest { public static void main(String[] args) {
    int min = 101, max = 0,
            count = 1;

    System.out.println("Welcome to Smallest to Highest program!" +
            " This program will collect int number from 1 to 100" +
            " with smallest and highest numbers.");
    System.out.print("Random numbers: ");

    while (count <= 10) {
        int rand = (int) (Math.random() * (101 - 1));
        System.out.print(rand + ", ");

        if (rand < min)
            min = rand;
        if (rand > max)
            max = rand;

        count++;
    }

    System.out.println("");
    System.out.println(String.format("Largest is %s", max));
    System.out.println(String.format("Smallest is %s", min));
}
}

