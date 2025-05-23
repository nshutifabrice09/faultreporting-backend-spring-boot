package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    Attachment findAttachmentById(Long id);
}
