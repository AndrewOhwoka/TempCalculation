import java.util.Scanner;

/**
 * TemperatureCalculation
 */
public class TemperatureCalculation {

    public static void main(String[] args) {
        // create a scanner object
       Scanner scanner = new Scanner(System.in);

       // declare variables
       double[] temperature;
       int days;

       // prrompt the user to enter days
       System.out.print("Enter the number of days: ");
       days = scanner.nextInt();

       // instantiate the array
       temperature = new double[days];

       // intialization
       for (int i = 0; i < days; i++) {
           System.out.print("Enter the temperature for day " + (i + 1) + ": ");
           temperature[i] = scanner.nextDouble();
       }

       // calculate the average temperature
      int averageTemperature = calculateAverage(temperatures);
    }
}