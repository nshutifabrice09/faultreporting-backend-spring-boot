package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.service.FaultReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class FaultReportController {

    private final FaultReportService faultReportService;


    @Autowired
    public FaultReportController(FaultReportService faultReportService) {
        this.faultReportService = faultReportService;
    }
}
