package com.bridgelabz;
// Custom exception for invalid robot safety inputs
public class RobotSafetyException extends Exception{

    public RobotSafetyException(String message){
        super(message);
    }
}
