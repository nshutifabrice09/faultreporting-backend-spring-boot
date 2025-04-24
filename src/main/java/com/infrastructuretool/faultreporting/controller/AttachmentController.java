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

    @PostMapping("/attachment")
    public Attachment save(@RequestBody Attachment attachment){
        return attachmentService.saveAttachment(attachment);
    }

    @GetMapping("/attachments")
    public List<Attachment> getAttachmentList(){
        return attachmentService.getAllAttachments();
    }

    @GetMapping("/attachment/{id}")
    public Attachment getAttachmentById(@PathVariable ("id") Long id){
        return attachmentService.getAttachmentById(id);
    }

    @PutMapping("/update/attachment/{id}")
    public Attachment updateAttachment(@PathVariable ("id") Long id, @RequestBody Attachment attachment){
        return attachmentService.updateAttachment(id, attachment);
    }

    @DeleteMapping("/delete/attachment/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        attachmentService.deleteById(id);
    }
}
