package com.bridgelabz;
/*
 * This program accepts robot hazard-related inputs from the user,
 * validates the entered values using conditional statements,
 * calculates the hazard risk score for valid inputs,
 * and displays an appropriate error message for invalid inputs.
 */

import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
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

        if(armPrecision<0.0 || armPrecision>1.0){ // Validate arm precision
            System.out.println("Error: Arm precision must be 0.0-1.0");
        }
        else if(workerDensity<1 || workerDensity>20){ // Validate worker density
            System.out.println("Error: Worker density must be 1-20");
        }
        else if(!machineryState.equals("Worn")
        && (!machineryState.equals("Faulty"))
        && (!machineryState.equals("Critical"))){ // Validate machinery state
            System.out.println("Error: Unsupported machinerystate");
        } else {
            double machineRiskFactor = 0.0;


            //Determining the machine risk factor based on machinery state.
            if (machineryState.equals("Worn")) {
                machineRiskFactor = 1.3;
            } else if (machineryState.equals("Faulty")) {
                machineRiskFactor = 2.0;
            } else if (machineryState.equals("Critical")) {
                machineRiskFactor = 3.0;
            }

            double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity *
                    machineRiskFactor);//Hazard risk formula
            System.out.println("Hazard Risk Score is: " + hazardRisk);//Printing the hazard risk score
        }
            input.close();
    }
}