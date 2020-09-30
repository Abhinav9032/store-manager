package com.store.manage.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "carousel")
public class CarouselEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "cre_date")
  @CreatedDate
  private Timestamp createdDate = new Timestamp(new Date().getTime());

  @Column(name = "caption_small")
  private String captionSmall;

  @Column(name = "caption_head")
  private String captionHead;

  @Column(name = "image_used")
  private String imageUsed;

  public CarouselEntity() {}

  public CarouselEntity(Long id, String captionSmall, String captionHead, String imageUsed) {
    this.id = id;
    this.captionSmall = captionSmall;
    this.captionHead = captionHead;
    this.imageUsed = imageUsed;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Timestamp getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Timestamp createdDate) {
    this.createdDate = createdDate;
  }

  public String getCaptionSmall() {
    return captionSmall;
  }

  public void setCaptionSmall(String captionSmall) {
    this.captionSmall = captionSmall;
  }

  public String getCaptionHead() {
    return captionHead;
  }

  public void setCaptionHead(String captionHead) {
    this.captionHead = captionHead;
  }

  public String getImageUsed() {
    return imageUsed;
  }

  public void setImageUsed(String imageUsed) {
    this.imageUsed = imageUsed;
  }

  @Override
  public String toString() {
    return "Carousel [id="
        + id
        + ", createdDate="
        + createdDate
        + ", captionSmall="
        + captionSmall
        + ", captionHead="
        + captionHead
        + ", imageUsed="
        + imageUsed
        + "]";
  }
}
