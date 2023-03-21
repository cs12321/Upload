package com.example.PhotoUpload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.*;
import java.io.IOException;

@RestController
public class Controller {
    private Set<Photo> photos;

    @GetMapping("/upload")
    public void uploadImg(@RequestPart("data") MultipartFile file, @RequestParam String label) throws IOException {
        photos.add(new Photo(file.getOriginalFilename(), label));


    }

}
