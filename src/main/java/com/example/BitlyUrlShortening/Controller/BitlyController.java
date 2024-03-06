package com.example.BitlyUrlShortening.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BitlyUrlShortening.Model.BitlyRequest;
import com.example.BitlyUrlShortening.Service.BitlyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class BitlyController {
	@Autowired
	BitlyService bitlyService;
	@PostMapping("/processBitly")
	public String processBitly(@RequestBody BitlyRequest bitlyRequest) {
	String shortURL = bitlyService.getShortURL(bitlyRequest.getLongURL());
			
		
		return shortURL;
		
	}
	

}
