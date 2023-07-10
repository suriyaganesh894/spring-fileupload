package com.suriya.springfileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suriya.springfileupload.entity.Attachment;

@Repository
public interface AttachmentRepo extends JpaRepository<Attachment,String> {
    
}
