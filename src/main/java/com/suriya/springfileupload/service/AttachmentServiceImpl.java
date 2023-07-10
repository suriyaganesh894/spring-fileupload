package com.suriya.springfileupload.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.suriya.springfileupload.entity.Attachment;
import com.suriya.springfileupload.repository.AttachmentRepo;

@Service
public class AttachmentServiceImpl implements AttachmentService{


    @Autowired
    private AttachmentRepo attachmentRepo;

    @Override
    public Attachment saveAttachment(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            
            Attachment attachment = new Attachment(fileName,file.getContentType(),file.getBytes());
            return attachmentRepo.save(attachment);
        
    }

    @Override
    public Attachment getAttachment(String fileid) throws Exception {
        return attachmentRepo.findById(fileid).orElseThrow(()-> new Exception("File not found with id "+fileid));
    }
    
}
