package com.store.manage.dto;

public class CarouselAttributes {
	private String captionHead;
	private String captionSmall;
	
	public CarouselAttributes(){
		
	}
	public String getCaptionHead() {
		return captionHead;
	}
	public void setCaptionHead(String captionHead) {
		this.captionHead = captionHead;
	}
	public String getCaptionSmall() {
		return captionSmall;
	}
	public void setCaptionSmall(String captionSmall) {
		this.captionSmall = captionSmall;
	}
	
	
	public CarouselAttributes(String captionHead, String captionSmall) {
		this.captionHead = captionHead;
		this.captionSmall = captionSmall;
	}
	
	
	@Override
	public String toString() {
		return "CarouselAttributes [captionHead=" + captionHead + ", captionSmall=" + captionSmall + "]";
	}
	
	
	

}
