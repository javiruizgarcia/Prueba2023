package com.prueba.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Prices;
import com.prueba.repository.IPricesRepository;

@Service
public class PriceService implements IPriceService {
	
	@Autowired
	IPricesRepository repo;

	@Override
	public Prices getPrice(Date date, Long product, Long group) {
		return null;
	}

}
