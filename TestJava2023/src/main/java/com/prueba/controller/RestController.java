package com.prueba.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.entity.Prices;
import com.prueba.service.IPriceService;

@Controller
public class RestController {
	
	@Autowired
	private IPriceService priceService;
	
	@GetMapping("/findPrice")
	public Prices getPrice(@RequestParam("date") Date date, @RequestParam("product") Long product, @RequestParam("group") Long group) {
		return null;
	} 
	
	

	
}
