package com.wuchengdong.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

    String imageUpload(MultipartFile file,String dir);
}
