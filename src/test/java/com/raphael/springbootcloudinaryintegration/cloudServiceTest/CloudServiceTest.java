package com.raphael.springbootcloudinaryintegration.cloudServiceTest;

import com.raphael.springbootcloudinaryintegration.CloudService.CloudinaryCloudService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

import static com.raphael.springbootcloudinaryintegration.utils.AppUtils.TEST_IMAGE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CloudServiceTest {

    @Autowired
    private CloudinaryCloudService cloudinaryCloudService;

    private MockMultipartFile image;

    @BeforeEach
    void setUp() throws IOException {
        // TODO: given that I have an image
        image = new MockMultipartFile("image1", new FileInputStream(TEST_IMAGE));
    }

    @Test
    public void uploadImage() {


        // TODO: when I upload the image on cloudinary
        String cloudinaryImageUrl = cloudinaryCloudService.uploadImage(image);
        // TODO: then I should get a response
        assertThat((cloudinaryImageUrl)).isNotNull();

    }

}
