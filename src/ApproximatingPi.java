import java.util.Scanner;

public class ApproximatingPi {
// Written by: Mike Baldwin
// Calculates PI using the Gregory-Leibniz Series.

public static void main(String[] args) {
    Scanner inputStream = new Scanner(System.in);
    double pi;
    int divisionCount;
    double tempVar;
    double denominator;

    System.out.print("Enter a number of divisions (The more divisions the closer the approximation): ");
    divisionCount = inputStream.nextInt();

    tempVar = 1.0;
    denominator = 3.0;

    for (int i = 0; i < divisionCount; i++) {
        if ((i % 2) == 0) {
            tempVar -= 1.0 / denominator;
        } else {
            tempVar += 1.0 / denominator;
        }
        denominator += 2.0;
    }

    pi = 4.0 * tempVar;
    System.out.println("The Java math library's Pi is: " + Math.PI);
    System.out.println("You have approximated Pi as:   " + pi);
}
}
