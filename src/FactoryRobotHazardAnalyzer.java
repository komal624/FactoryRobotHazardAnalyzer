import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        // Input collection
        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        // UC4: Validation using if-else
        if (armPrecision <= 0 || armPrecision > 100) {
            System.out.println("Invalid Arm Precision. Must be between 1 and 100.");
        }
        else if (workerDensity < 0 || workerDensity > 500) {
            System.out.println("Invalid Worker Density. Must be between 0 and 500.");
        }
        else {
            double hazardRisk = armPrecision * workerDensity;
            System.out.println("Hazard Risk Score: " + hazardRisk);
        }

        scanner.close();
    }
}
