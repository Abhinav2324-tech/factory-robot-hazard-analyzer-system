package com.bridgelabz;
/*
 * This program accepts robot hazard-related inputs from the user,
 * calculates the hazard risk score using the given formula,
 * and displays the calculated result.
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

        double machineRiskFactor=0.0;
        //Determining the machine risk factor based on machinery state.
        if(machineryState.equals("Worn")){
            machineRiskFactor=1.3;
        }
        else if(machineryState.equals("Faulty")){
            machineRiskFactor=2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor=3.0;
        }
        double hazardRisk=((1.0 - armPrecision) * 15.0) + (workerDensity *
                machineRiskFactor);//Hazard risk formula
        System.out.println("Hazard Risk Score is: "+hazardRisk);//Printing the hazard risk score
        input.close();
    }
}