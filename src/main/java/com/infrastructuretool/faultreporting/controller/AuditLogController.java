package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.AuditLog;
import com.infrastructuretool.faultreporting.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class AuditLogController {

    private final AuditLogService auditLogService;

    @Autowired
    public AuditLogController (AuditLogService auditLogService){
        this.auditLogService = auditLogService;
    }

    @PostMapping("/auditLog")
    public AuditLog save(@RequestBody AuditLog auditLog){
        return auditLogService.saveAuditLog(auditLog);
    }


}
