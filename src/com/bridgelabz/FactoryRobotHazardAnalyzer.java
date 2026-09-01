package com.bridgelabz;
/*
 * This program accepts arm precision, worker density, and machinery state
 * from the user. The validation and hazard risk calculation logic is moved
 * into a separate calculateHazardRisk() method. The method validates the
 * inputs, calculates the hazard risk for valid values, and returns the
 * calculated risk score.
 */

import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
    // Method to validate inputs and calculate hazard risk
    public double calculateRisk(double armPrecision, int workerDensity, String machineryState){

        if(armPrecision<0.0 || armPrecision>1.0){ // Validate arm precision
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return -1;
        }
        if(workerDensity<1 || workerDensity>20){ // Validate worker density
            System.out.println("Error: Worker density must be 1-20");
            return -1;
        }
        if(!machineryState.equals("Worn")
                && (!machineryState.equals("Faulty"))
                && (!machineryState.equals("Critical"))){ // Validate machinery state
            System.out.println("Error: Unsupported machinery state");
            return -1;
        }
    double machineRiskFactor=0.0;

        //Determining the machine risk factor based on machinery state.
        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor); //Hazard risk calculation formula
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Taking the input from user.
        System.out.println("Enter the arm precision:");
        double armPrecision=input.nextDouble();
        System.out.println("Enter the worker density:");
        int workerDensity=input.nextInt();
        input.nextLine();
        System.out.println("Enter the machinery state:");
        String machineryState=input.nextLine();

        FactoryRobotHazardAnalyzer analyzer=new FactoryRobotHazardAnalyzer();

        double hazardRisk = analyzer.calculateRisk(armPrecision, workerDensity, machineryState);

            if(hazardRisk!=-1) {
                System.out.println("Hazard Risk Score is: " + hazardRisk);//Printing the hazard risk score
            }
            input.close();
    }
}