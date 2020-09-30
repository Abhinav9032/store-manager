package com.store.manage.entity;

import com.store.manage.dto.ProductsDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "cost")
  private float cost;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "discount")
  private int discount;

  @Column(name = "vendor_id")
  private Long vendorId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "description")
  private String description;

  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "subcategory_id")
  private Long subcategoryId;

  public Long getSubcategoryId() {
    return subcategoryId;
  }

  public void setSubcategoryId(Long subcategoryId) {
    this.subcategoryId = subcategoryId;
  }
  // Will need a list in future
  @Column(name = "colour")
  private String color;

  @Column(name = "brand")
  private String brand;

  @Column(name = "product_image")
  private String productImageUrl;

  // Will need a list in future
  @Column(name = "size")
  private String size;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  public Long getVendorId() {
    return vendorId;
  }

  public void setVendorId(Long vendorId) {
    this.vendorId = vendorId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ProductEntity(
      Long id,
      float cost,
      int quantity,
      int discount,
      Long vendorId,
      String productName,
      String description,
      Long categoryId,
      String color,
      String brand,
      String productImageUrl,
      String size) {
    this.id = id;
    this.cost = cost;
    this.quantity = quantity;
    this.discount = discount;
    this.vendorId = vendorId;
    this.productName = productName;
    this.description = description;
    this.categoryId = categoryId;
    this.color = color;
    this.brand = brand;
    this.productImageUrl = productImageUrl;
    this.size = size;
  }

  public ProductEntity(ProductsDTO products, String imageUrl) {
    this.cost = products.getCost();
    this.quantity = products.getQuantity();
    this.discount = products.getDiscount();
    this.vendorId = products.getVendorId();
    this.productName = products.getProductName();
    this.description = products.getDescription();
    this.categoryId = products.getCategoryId();
    this.color = products.getColor();
    this.brand = products.getBrand();
    this.productImageUrl = imageUrl;
    this.size = products.getSize();
    this.subcategoryId = products.getSubcategoryId();
  }

  public ProductEntity() {}

  @Override
  public String toString() {
    return "ProductEntity [id="
        + id
        + ", cost="
        + cost
        + ", quantity="
        + quantity
        + ", discount="
        + discount
        + ", vendorId="
        + vendorId
        + ", productName="
        + productName
        + ", description="
        + description
        + ", categoryId="
        + categoryId
        + ", color="
        + color
        + ", brand="
        + brand
        + ", productImageUrl="
        + productImageUrl
        + ", size="
        + size
        + "]";
  }
}
