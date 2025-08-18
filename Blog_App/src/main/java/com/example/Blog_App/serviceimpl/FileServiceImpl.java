package com.example.Blog_App.serviceimpl;

import com.example.Blog_App.services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.*;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {

        // Original file name
        String name = file.getOriginalFilename();

        // Generate random name with extension
        String randomID = UUID.randomUUID().toString();
        String fileName1 = randomID.concat(name.substring(name.lastIndexOf(".")));

        // Create directory if not exists
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Full file path
        Path filePath = Paths.get(path, fileName1);

        // Copy file (replace if exists)
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        return fileName1;
    }

    @Override
    public InputStream getResource(String path, String fileName) throws FileNotFoundException {
        String fullPath = path + File.separator + fileName;
        return new FileInputStream(fullPath);
    }
}
