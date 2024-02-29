package com.prueba.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;

@Entity
public class Prices implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="brand_id")
	private Long brandId;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="price_list")
	private Long priceList;
	
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="priority")
	private Long priority;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="curr")
	private String curr;
	
	@JoinColumn(name = "brand_id", nullable = false, updatable = false, insertable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Groups group;
	
	@JoinColumn(name = "product_id", nullable = false, updatable = false, insertable = false)
	@ManyToOne(fetch = FetchType.LAZY)
    private Products product;

}
