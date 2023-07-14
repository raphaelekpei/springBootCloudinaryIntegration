package com.raphael.springbootcloudinaryintegration.CloudService;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryCloudService {

    String uploadImage(MultipartFile image);

}
