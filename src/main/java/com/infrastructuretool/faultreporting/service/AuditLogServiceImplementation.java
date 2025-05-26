package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.AuditLog;
import com.infrastructuretool.faultreporting.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{

    private final AuditLogRepository auditLogRepository;

    @Autowired
    public AuditLogServiceImplementation(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Override
    public List<AuditLog> getAllAuditLogs() {
        return null;
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return null;
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog, Long faultReportId) {
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
