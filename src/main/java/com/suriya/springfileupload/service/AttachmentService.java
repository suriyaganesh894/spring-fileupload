package com.suriya.springfileupload.service;

import org.springframework.web.multipart.MultipartFile;

import com.suriya.springfileupload.entity.Attachment;

public interface AttachmentService {

    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileid) throws Exception;
    
}
