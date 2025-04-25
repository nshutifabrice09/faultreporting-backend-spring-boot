package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.FaultReport;
import com.infrastructuretool.faultreporting.service.FaultReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class FaultReportController {

    private final FaultReportService faultReportService;

    @Autowired
    public FaultReportController(FaultReportService faultReportService){
        this.faultReportService = faultReportService;
    }

    @PostMapping("/faultReport")
    public FaultReport save(@RequestBody FaultReport faultReport){
        return faultReportService.saveFaultReport(faultReport);
    }

    @GetMapping("/faultReports")
    public List<FaultReport> getFaultReportList(){
        return faultReportService.getAllFaultReports();
    }

    @GetMapping("/faultReport/{id}")
    public FaultReport findById(@PathVariable ("id") Long id){
        return faultReportService.getFaultReportById(id);
    }

    @PutMapping("/update/faultReport/{id}")
    public FaultReport updateFaultReport(@PathVariable ("id") Long id, @RequestBody FaultReport faultReport){
        return faultReportService.updateFaultReport(id, faultReport);
    }

    @DeleteMapping("/delete/faultReport/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        faultReportService.deleteById(id);
    }
}
