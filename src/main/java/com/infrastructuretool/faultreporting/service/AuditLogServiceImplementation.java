package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.AuditLog;
import com.infrastructuretool.faultreporting.model.FaultReport;
import com.infrastructuretool.faultreporting.repository.AuditLogRepository;
import com.infrastructuretool.faultreporting.repository.FaultReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{

    private final AuditLogRepository auditLogRepository;
    private final FaultReportRepository faultReportRepository;

    @Autowired
    public AuditLogServiceImplementation(AuditLogRepository auditLogRepository, FaultReportRepository faultReportRepository) {
        this.auditLogRepository = auditLogRepository;
        this.faultReportRepository = faultReportRepository;
    }

    @Override
    public List<AuditLog> getAllAuditLogs() {
        return auditLogRepository.findAll();
    }

    @Override
    public AuditLog getAuditLogById(Long id) {
        return auditLogRepository.findAuditLogById(id);
    }

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog, Long faultReportId) {
        FaultReport faultReport = faultReportRepository.findFaultReportById(faultReportId);
        auditLog.setFaultReport(faultReport);
        return auditLogRepository.save(auditLog);
    }


    @Override
    public AuditLog updateAuditLog(Long id, AuditLog auditLog) {
        AuditLog existAuditLog = auditLogRepository.findAuditLogById(id);
        if(existAuditLog != null){
            existAuditLog.setAction(auditLog.getAction());
            existAuditLog.setPerformedBy(auditLog.getPerformedBy());
            existAuditLog.setTimestamp(auditLog.getTimestamp());
            return auditLogRepository.save(existAuditLog);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        auditLogRepository.deleteById(id);
    }
}
