package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
