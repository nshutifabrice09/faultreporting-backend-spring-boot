package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.FaultReport;

import java.util.List;

public interface FaultReportService {
    List<FaultReport> getAllFaultReports();
    FaultReport getFaultReportById (Long id);
    FaultReport saveFaultReport (FaultReport faultReport);
    FaultReport updateFaultReport (Long id, FaultReport faultReport);
    void deleteById (Long id);
}
