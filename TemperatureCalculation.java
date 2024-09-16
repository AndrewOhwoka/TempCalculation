import java.util.Scanner;

/**
 * TemperatureCalculation
 */
public class TemperatureCalculation {

    public static void main(String[] args) {
        // create a scanner object
       Scanner scanner = new Scanner(System.in);

       // declare variables
       double[] temperatures;
       int days;

       // prrompt the user to enter days
       System.out.print("Enter the number of days: ");
       days = scanner.nextInt();

       // instantiate the array
       temperatures = new double[days];

       // intialization
       for (int i = 0; i < days; i++) {
           System.out.print("Enter the temperature for day " + (i + 1) + ": ");
           temperatures[i] = scanner.nextDouble();
       }

       // calculate the average temperature
       double averageTemperature = calculateAverage(temperatures);

       // calculate the temperatures above the average
       int aboveAverage = calculateAboveAverage(temperatures, averageTemperature);

       // print the results
       System.out.println("The average temperature is: " + averageTemperature);
       System.out.println("The temperatures above the average are: " + aboveAverage);

       // close the scanner
       scanner.close();
    }
    // calculate the average temperature
    public static double calculateAverage(double[] temperatures) {
        double sum = 0.0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }
    // calculate the temperatures above the average
    public static int calculateAboveAverage(double[] temperatures, double averageTemperature) {
        int count = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                count++;
            }
        }
        return count;
    }
}