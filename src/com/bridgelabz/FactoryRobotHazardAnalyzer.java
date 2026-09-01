package com.bridgelabz;
/*
 * This program accepts robot hazard inputs from the user, validates them,
 * maps the machinery state to its corresponding risk factor, calculates
 * the hazard risk score, and handles invalid scenarios using the custom
 * RobotSafetyException.
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

        RobotHazardAuditor auditor=new RobotHazardAuditor();

        try {
            double hazardRisk = auditor.calculateRisk(armPrecision, workerDensity, machineryState);

            System.out.println("Hazard Risk Score is: " + hazardRisk);//Printing the hazard risk score
        } catch (RobotSafetyException exception){
            // Display exception message
            System.out.println(exception.getMessage());
        }

            input.close();
    }
}