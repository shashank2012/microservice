package com.niit.springboot.models;

import org.springframework.data.repository.CrudRepository;

//@Transactional
public interface ItemInfoRepository extends CrudRepository<ItemInfo, Long> {
 
 /**
    * This method will find an Boooking instance in the database by its departure.
    * Note that this method is not implemented and its working code will be
    * automatically generated from its signature by Spring Data JPA.
    */
   public ItemInfo findByItemId(Long itemId);
}
