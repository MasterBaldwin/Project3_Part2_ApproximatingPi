import javax.swing.*;

public class ApproximatingPi {
// Written by: Mike Baldwin
// Calculates PI using the Gregory-Leibniz Series.

public static void main(String[] args) {
    long divCount, time;
    double pi;
    String tempString;

    tempString = JOptionPane.showInputDialog(
            null,
            "Enter a number of divisions\n" +
                    "(The more divisions the closer the approximation)",
            "Approximating Pi",
            JOptionPane.QUESTION_MESSAGE);
    divCount = Long.parseLong(tempString);
    time = System.currentTimeMillis();
    pi = LeibnizMethod(divCount);
    time = System.currentTimeMillis() - time;

    JOptionPane.showMessageDialog(
            null,
            "The Java math library's Pi is: " + Math.PI + "\n" +
                    "The GregoryLeibniz Series is: " + pi + "\n" +
                    "It took " + time + " milliseconds to compute",
            "Approximating Pi",
            JOptionPane.INFORMATION_MESSAGE);
}

private static double LeibnizMethod(long divCount) {
    double tempVar, denominator;

    tempVar = 1.0;
    denominator = 3.0;

    for (long i = 0; i < divCount; i++) {
        if ((i % 2) == 0) {
            tempVar -= 1.0 / denominator;
        } else {
            tempVar += 1.0 / denominator;
        }
        denominator += 2.0;
    }

    return 4.0 * tempVar;
}
}
