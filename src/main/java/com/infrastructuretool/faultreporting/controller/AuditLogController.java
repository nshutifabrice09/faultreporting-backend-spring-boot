package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.AuditLog;
import com.infrastructuretool.faultreporting.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/auditLogs")
    public List<AuditLog> auditLogList(){
        return auditLogService.getAllAuditLogs();
    }

    @GetMapping("/auditLog/{id}")
    public AuditLog findById(@PathVariable ("id") Long id){
        return auditLogService.getAuditLogById(id);
    }

    @PutMapping("/update/auditLog/{id}")
    public AuditLog updateAuditLog (@PathVariable ("id") Long id, @RequestBody AuditLog auditLog){
        return auditLogService.updateAuditLog(id, auditLog);
    }

    @DeleteMapping("/delete/auditLog/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        auditLogService.deleteById(id);
    }

}
