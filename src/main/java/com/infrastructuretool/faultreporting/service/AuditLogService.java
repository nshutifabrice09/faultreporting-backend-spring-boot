package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.AuditLog;

import java.util.List;

public interface AuditLogService {
    List<AuditLog> getAllAuditLogs();
    AuditLog getAuditLogById(Long id);
    AuditLog saveAuditLog(AuditLog auditLog, Long faultReportId);
    AuditLog updateAuditLog(Long id, AuditLog auditLog);
    void deleteById(Long id);
}
