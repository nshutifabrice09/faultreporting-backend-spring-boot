package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Attachment;
import com.infrastructuretool.faultreporting.model.FaultReport;
import com.infrastructuretool.faultreporting.repository.AttachmentRepository;
import com.infrastructuretool.faultreporting.repository.FaultReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImplementation implements AttachmentService{

    private final AttachmentRepository attachmentRepository;
    private final FaultReportRepository faultReportRepository;

    @Autowired
    public AttachmentServiceImplementation(AttachmentRepository attachmentRepository, FaultReportRepository faultReportRepository) {
        this.attachmentRepository = attachmentRepository;
        this.faultReportRepository = faultReportRepository;
    }

    @Override
    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll();
    }

    @Override
    public Attachment saveAttachment(Attachment attachment, Long faultReportId) {
        FaultReport faultReport = faultReportRepository.findFaultReportById(faultReportId);
        attachment.setFaultReport(faultReport);
        return attachmentRepository.save(attachment);
    }


    @Override
    public Attachment getAttachmentById(Long id) {
        return attachmentRepository.findAttachmentById(id);
    }

    @Override
    public Attachment updateAttachment(Long id, Attachment attachment) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        attachmentRepository.deleteById(id);
    }
}
