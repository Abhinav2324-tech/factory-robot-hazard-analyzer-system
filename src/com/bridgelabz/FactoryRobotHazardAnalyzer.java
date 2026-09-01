package com.bridgelabz;
/*
 * This program accepts robot hazard-related inputs from the user,
 * including arm precision, worker density, and machinery state,
 * and displays the entered values.
 */
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the arm precision:");
        double armPrecision=input.nextDouble();
        System.out.println("Enter the worker density:");
        int workerDensity=input.nextInt();
        input.nextLine();
        System.out.println("Enter the machinery state:");
        String machineryState=input.nextLine();

        System.out.println("Arm Precision: "+armPrecision);
        System.out.println("Worker Density: "+workerDensity);
        System.out.println("Machinery State: "+machineryState);
        input.close();
    }
}