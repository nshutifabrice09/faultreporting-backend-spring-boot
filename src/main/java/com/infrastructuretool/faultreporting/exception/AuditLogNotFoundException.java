package com.infrastructuretool.faultreporting.exception;

import com.infrastructuretool.faultreporting.model.AuditLog;

public class AuditLogNotFoundException extends RuntimeException{

    public AuditLogNotFoundException (Long id){
        super ("Couldn't find the AuditLog with id "+id);
    }
}
