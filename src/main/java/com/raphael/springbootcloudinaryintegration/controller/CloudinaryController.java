package com.raphael.springbootcloudinaryintegration.controller;

import com.raphael.springbootcloudinaryintegration.CloudService.CloudinaryCloudService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/upload")
public class CloudinaryController {
    private final CloudinaryCloudService cloudinaryCloudService;



    @PostMapping("/photo")
    public ResponseEntity<String> uploadImage(@RequestParam MultipartFile image) {
        String imageUrl = cloudinaryCloudService.uploadImage(image);
        return ResponseEntity.ok(imageUrl);
    }

}
