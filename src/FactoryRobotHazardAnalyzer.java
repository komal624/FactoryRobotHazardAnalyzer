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

        // UC3: Risk Calculation (No Validation)
        double hazardRisk = armPrecision * workerDensity;

        // Output
        System.out.println("Hazard Risk Score: " + hazardRisk);

        scanner.close();
    }
}
