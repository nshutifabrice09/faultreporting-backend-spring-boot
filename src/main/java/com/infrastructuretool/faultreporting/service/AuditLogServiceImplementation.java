package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.AuditLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{
    @Override
    public List<AuditLog> getAllAuditLogs() {
        return null;
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return null;
    }
    

    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
