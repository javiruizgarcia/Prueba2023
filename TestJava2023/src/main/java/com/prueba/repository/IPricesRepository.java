package com.prueba.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prueba.entity.Prices;

public interface IPricesRepository extends JpaRepository<Prices, Long> {
	@Query(nativeQuery = true, value="SELECT p FROM Prices p where brand_id = :group and product_id = :product and :date BETWEEN star_date AND end_date") 
	List <Prices> findPrice(@Param("date") Date date,  @Param("product") Long product, @Param("group") Long group);
}