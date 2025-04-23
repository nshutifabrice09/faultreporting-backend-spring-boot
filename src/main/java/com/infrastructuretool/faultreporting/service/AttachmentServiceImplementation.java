package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Attachment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImplementation implements AttachmentService{
    @Override
    public List<Attachment> getAllAttachments() {
        return null;
    }

    @Override
    public Attachment saveAttachment(Attachment attachment) {
        return null;
    }

    @Override
    public Attachment getAttachmentById(Long id) {
        return null;
    }

    @Override
    public Attachment updateAttachment(Long id, Attachment attachment) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
