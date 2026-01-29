public class RobotHazardAuditor {

    public static double calculateHazardRisk(double armPrecision,
                                             int workerDensity,
                                             String machineryState)
            throws RobotSafetyException {

        // Validation (from UC6)
        if (armPrecision <= 0 || armPrecision > 100) {
            throw new RobotSafetyException("Arm Precision must be between 1 and 100");
        }

        if (workerDensity < 0 || workerDensity > 500) {
            throw new RobotSafetyException("Worker Density must be between 0 and 500");
        }

        // UC7: Machinery State Mapping
        double riskFactor;

        if (machineryState.equals("Worn")) {
            riskFactor = 1.2;
        } else if (machineryState.equals("Faulty")) {
            riskFactor = 1.5;
        } else if (machineryState.equals("Critical")) {
            riskFactor = 2.0;
        } else {
            throw new RobotSafetyException("Unsupported Machinery State");
        }

        return (armPrecision * workerDensity) * riskFactor;
    }
}
