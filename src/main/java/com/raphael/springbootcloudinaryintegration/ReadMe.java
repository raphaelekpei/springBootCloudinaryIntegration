package com.raphael.springbootcloudinaryintegration;

public class ReadMe {

    /*

    To integrate Spring Boot with Cloudinary for photo uploads, you can follow these steps:

1. Sign up for Cloudinary: Go to the Cloudinary website (https://cloudinary.com/) and sign up for an account.
You will receive credentials (API Key, API Secret, and Cloud Name) required to connect your Spring Boot application with Cloudinary.

2. Add Cloudinary Java SDK dependency: Open your Spring Boot project's pom.xml file and add the Cloudinary Java SDK dependency:
     <dependency>
    <groupId>com.cloudinary</groupId>
    <artifactId>cloudinary-http44</artifactId>
    <version>1.30.0</version>
    </dependency>
3. Configure Cloudinary credentials: Open the application.properties file and add the Cloudinary credentials obtained from your Cloudinary account:
cloudinary.cloud-name=your-cloud-name
cloudinary.api-key=your-api-key
cloudinary.api-secret=your-api-secret

4. Create a Cloudinary service component: In your Spring Boot project, create a Cloudinary service component that will handle the integration with Cloudinary.
This component will provide methods for uploading photos and handling the Cloudinary-related logic.

5. Configure Cloudinary bean: Create a configuration class in your Spring Boot project to define the Cloudinary bean.
This class will use the Cloudinary credentials from the application.properties file to configure the Cloudinary instance.

6. Use the Cloudinary service in your controller: In your controller, inject the CloudinaryService and use it to handle photo uploads

     */
}
