package com.store.manage.controller;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@CrossOrigin
	@GetMapping("/get")
	public ResponseTemp testsGetWithStaticString() {
		
		ResponseTemp response = new ResponseTemp();
		
		System.out.println("Service invoked");
		
		return new ResponseTemp("Abhinav" , LocalTime.now());
	}
}

class ResponseTemp {
	private String name;
	private LocalTime time;
	
	ResponseTemp(){
		
	}
	ResponseTemp(String name ,LocalTime time ){
		this.name= name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ResponseTemp [name=" + name + ", time=" + time + "]";
	}
	
	
	
}