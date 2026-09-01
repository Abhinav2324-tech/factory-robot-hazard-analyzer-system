package com.bridgelabz;

public class RobotHazardAuditor {
    // Method to validate inputs and calculate hazard risk
    public double calculateRisk(double armPrecision, int workerDensity, String machineryState)
            throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) { // Validate arm precision
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }
        if (workerDensity < 1 || workerDensity > 20) { // Validate worker density
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }
        if (!machineryState.equals("Worn")
                && (!machineryState.equals("Faulty"))
                && (!machineryState.equals("Critical"))) { // Validate machinery state
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }
        // Get machinery risk factor
        double machineRiskFactor = getMachineRiskFactor(machineryState);
        // Calculate and return hazard risk score
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }

    // Method to map machinery state to risk factor
    private double getMachineRiskFactor(String machineryState)
            throws RobotSafetyException {


        //Determining the machine risk factor based on machinery state.
        if (machineryState.equals("Worn")) {
            return 1.3;
        } else if (machineryState.equals("Faulty")) {
            return 2.0;
        } else if (machineryState.equals("Critical")) {
            return 3.0;
        } else {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }

    }
}
