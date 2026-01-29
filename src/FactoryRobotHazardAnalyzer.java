import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        try {
            // Inputs
            System.out.print("Enter Arm Precision: ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter Worker Density: ");
            int workerDensity = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Machinery State (Worn, Faulty, Critical): ");
            String machineryState = scanner.nextLine();

            // Business logic
            double risk = RobotHazardAuditor.calculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Output
            System.out.println("Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println("Safety Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input Format");
        }

        scanner.close();
    }
}


