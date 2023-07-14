package com.raphael.springbootcloudinaryintegration.CloudService;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.raphael.springbootcloudinaryintegration.Exception.ImageUploadException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@AllArgsConstructor
public class CloudinaryCloudServiceImpl implements CloudinaryCloudService {

    private final Cloudinary cloudinary;
    @Override
    public String uploadImage(MultipartFile image) {
        try {
            return cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap()).get("url").toString();
        } catch (IOException e) {
            throw new ImageUploadException("Error saving file");
        }
             /*
     The try block calls the upload method on the cloudinary.uploader() object, passing in the byte array of the image data and an empty map of options.
     It then retrieves the resulting URL from the response and returns it as a string. You can also write the code as follows:
       Map<?, ?> response = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
       return response.get("url").toString();
      The catch block catches an IOException that might be thrown by the upload() method, and
      re-throws it as a more specific ImageUploadException with a custom error message.
      */

    }
}
