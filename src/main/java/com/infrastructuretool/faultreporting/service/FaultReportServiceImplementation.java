package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.FaultReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaultReportServiceImplementation implements FaultReportService{
    @Override
    public List<FaultReport> getAllFaultReports() {
        return null;
    }

    @Override
    public FaultReport getFaultReportById(Long id) {
        return null;
    }

    @Override
    public FaultReport saveFaultReport(FaultReport faultReport) {
        return null;
    }

    @Override
    public FaultReport updateFaultReport(Long id, FaultReport faultReport) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
