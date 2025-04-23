package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Attachment;

import java.util.List;
import java.util.UUID;

public interface AttachmentService {
    List<Attachment> getAllAttachments();
    Attachment saveAttachment(Attachment attachment);
    Attachment getAttachmentById(Long id);
    Attachment updateAttachment (Long id, Attachment attachment);
    void deleteById (Long id);
}
