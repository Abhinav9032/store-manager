package com.store.manage.service;

import com.store.manage.dto.CarouselAttributes;
import com.store.manage.entity.CarouselEntity;
import com.store.manage.repository.CarouselRepository;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarouselService {

  @Autowired CarouselRepository carouselRepository;

  public CarouselEntity saveCarouselItem(CarouselAttributes carouselAttributes, String imageUrl) {
    System.out.println(
        "Received the following in service "
            + "[ Carousel Attributes  : "
            + carouselAttributes
            + " "
            + ", Image Url: "
            + imageUrl
            + " ]");
    CarouselEntity carouselEntity = new CarouselEntity();
    carouselEntity.setCaptionHead(carouselAttributes.getCaptionHead());
    carouselEntity.setCaptionSmall(carouselAttributes.getCaptionSmall());
    carouselEntity.setImageUsed(imageUrl);
    carouselEntity.setCreatedDate(new Timestamp(new Date().getTime()));
    System.out.println("Carousel Entity passed to DB  - " + carouselEntity);
    CarouselEntity savedItem = carouselRepository.save(carouselEntity);
    System.out.println("Carousel Entity saved in DB - " + savedItem);
    return savedItem;
  }

  public ArrayList<CarouselEntity> findLastThree() {
    List<CarouselEntity> list = carouselRepository.findAll();
    ArrayList<CarouselEntity> listReturned = new ArrayList<>();
    System.out.println(list);
    for (int i = 1; i <= 3; i++) {
      listReturned.add(list.get(list.size() - i));
    }

    return listReturned;
  }
}
