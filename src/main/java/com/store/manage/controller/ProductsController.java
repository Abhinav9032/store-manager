package com.store.manage.controller;

import com.store.manage.dto.ProductsDTO;
import com.store.manage.entity.ProductEntity;
import com.store.manage.service.AmazonClient;
import com.store.manage.service.ProductsService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/products/")
public class ProductsController {
  private AmazonClient amazonClient;

  @Autowired ProductsService productsService;

  @Autowired
  ProductsController(AmazonClient amazonClient) {
    this.amazonClient = amazonClient;
  }

  @PostMapping("/uploadFile")
  public ProductEntity uploadFile(
      @RequestPart(value = "file") MultipartFile file, ProductsDTO products) {
    System.out.println(products);
    return productsService.saveProductDetails(products, this.amazonClient.uploadFile(file));
  }

  @CrossOrigin
  @GetMapping("/getProducts")
  public ArrayList<ProductEntity> showAllProducts() {

    return productsService.findAll();
  }
}
