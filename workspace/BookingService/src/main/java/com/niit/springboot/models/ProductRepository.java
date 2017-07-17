package com.niit.springboot.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public interface ProductRepository extends CrudRepository<Product, Long> {
 
 /**
    * This method will find an Boooking instance in the database by its departure.
    * Note that this method is not implemented and its working code will be
    * automatically generated from its signature by Spring Data JPA.
    */
   public Booking findByProductId(Long productId);
}
