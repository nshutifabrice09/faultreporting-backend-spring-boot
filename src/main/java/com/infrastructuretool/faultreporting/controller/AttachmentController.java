package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.Attachment;
import com.infrastructuretool.faultreporting.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AttachmentController {

    private final AttachmentService attachmentService;

    @Autowired
    public AttachmentController(AttachmentService attachmentService){
        this.attachmentService = attachmentService;
    }

    @PostMapping("/attachment/{faultReportId}")
    public Attachment save(@RequestBody Attachment attachment, @PathVariable ("faultReportId") Long faultReportId){
        return attachmentService.saveAttachment(attachment, faultReportId);
    }

}
