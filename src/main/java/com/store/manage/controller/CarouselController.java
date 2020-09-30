package com.store.manage.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.store.manage.dto.CarouselAttributes;
import com.store.manage.entity.CarouselEntity;
import com.store.manage.service.AmazonClient;
import com.store.manage.service.CarouselService;

@RestController
@RequestMapping("/storage/")
public class CarouselController {

	
    private AmazonClient amazonClient;
    
    @Autowired
    CarouselService carouselService;

    @Autowired
    CarouselController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public CarouselEntity uploadFile(@RequestPart(value = "file") MultipartFile file , CarouselAttributes carouselAttributes) {
    	System.out.println(carouselAttributes);
        return carouselService.saveCarouselItem(carouselAttributes , this.amazonClient.uploadFile(file));
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
    
    @CrossOrigin
    @GetMapping("/getImagesForCarousel")
    public ArrayList<CarouselEntity> showLastThreeUpdatedImages() {
    	return carouselService.findLastThree();
    }
    
    
}