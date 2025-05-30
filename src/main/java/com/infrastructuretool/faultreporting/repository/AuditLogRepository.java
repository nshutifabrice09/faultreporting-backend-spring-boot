package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    AuditLog findAuditLogById(Long id);
}
