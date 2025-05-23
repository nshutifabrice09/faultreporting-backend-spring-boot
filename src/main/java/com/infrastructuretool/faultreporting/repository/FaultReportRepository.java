package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.FaultReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaultReportRepository extends JpaRepository <FaultReport, Long> {
    FaultReport findFaultReportById(Long faultReportId);
}
