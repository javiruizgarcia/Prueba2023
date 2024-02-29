package com.prueba.service;

import java.sql.Date;

import com.prueba.entity.Prices;

public interface IPriceService {

	public Prices getPrice(Date date, Long product, Long group);
}
