package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.FaultReport;
import com.infrastructuretool.faultreporting.service.FaultReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class FaultReportController {

    private final FaultReportService faultReportService;

    @Autowired
    public FaultReportController(FaultReportService faultReportService){
        this.faultReportService = faultReportService;
    }

    @PostMapping("/faultreport")
    public FaultReport save(@RequestBody FaultReport faultReport){
        return faultReportService.saveFaultReport(faultReport);
    }
}
