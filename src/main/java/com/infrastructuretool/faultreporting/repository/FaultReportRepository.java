package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.FaultReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaultReportRepository extends JpaRepository <FaultReport, Long> {
}
