package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
