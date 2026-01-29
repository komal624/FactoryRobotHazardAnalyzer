import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        try {
            // Input collection
            System.out.print("Enter Arm Precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter Worker Density: ");
            int workerDensity = scanner.nextInt();

            // UC6: Call method that may throw exception
            double hazardRisk = calculateHazardRisk(armPrecision, workerDensity);

            System.out.println("Hazard Risk Score: " + hazardRisk);

        } catch (RobotSafetyException e) {
            // UC6: Exception message displayed here
            System.out.println("Safety Error: " + e.getMessage());
        }

        scanner.close();
    }

    // UC6: Business logic throws custom exception
    public static double calculateHazardRisk(double armPrecision, int workerDensity)
            throws RobotSafetyException {

        if (armPrecision <= 0 || armPrecision > 100) {
            throw new RobotSafetyException("Arm Precision must be between 1 and 100");
        }

        if (workerDensity < 0 || workerDensity > 500) {
            throw new RobotSafetyException("Worker Density must be between 0 and 500");
        }

        return armPrecision * workerDensity;
    }
}

