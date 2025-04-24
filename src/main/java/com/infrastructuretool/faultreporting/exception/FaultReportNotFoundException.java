package com.infrastructuretool.faultreporting.exception;

public class FaultReportNotFoundException extends RuntimeException{
    public FaultReportNotFoundException (Long id){
        super("Could not find a Fault Report with id "+id);
    }
}
