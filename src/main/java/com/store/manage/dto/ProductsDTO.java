package com.store.manage.dto;

public class ProductsDTO {

  private float cost;
  private int quantity;
  private int discount;
  private Long vendorId;
  private String productName;
  private String description;
  private Long categoryId;
  private String color;
  private String brand;
  private Long subcategoryId;

  private String size;

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

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ProductsDTO(
      Long id,
      float cost,
      int quantity,
      int discount,
      Long vendorId,
      String productName,
      String description,
      Long categoryId,
      Long subcategoryId,
      String color,
      String brand,
      String size) {
    super();
    this.cost = cost;
    this.quantity = quantity;
    this.discount = discount;
    this.vendorId = vendorId;
    this.productName = productName;
    this.description = description;
    this.categoryId = categoryId;
    this.color = color;
    this.brand = brand;
    this.size = size;
    this.subcategoryId = subcategoryId;
  }

  public ProductsDTO() {}

  @Override
  public String toString() {
    return "ProductsDTO [ cost="
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
        + ", size="
        + size
        + "]";
  }

  public Long getSubcategoryId() {
    return subcategoryId;
  }

  public void setSubcategoryId(Long subcategoryId) {
    this.subcategoryId = subcategoryId;
  }
}
