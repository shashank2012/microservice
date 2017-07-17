package com.niit.springboot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.springboot.models.Booking;
import com.niit.springboot.models.BookingRepository;
import com.niit.springboot.models.ItemInfo;
import com.niit.springboot.models.ItemInfoRepository;
import com.niit.springboot.models.ItemReview;
import com.niit.springboot.models.ItemReviewRepository;
import com.niit.springboot.models.Product;
import com.niit.springboot.models.ProductRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServiceImpl {

 @Autowired
 private BookingRepository bookingRepository;
 
 @Autowired
 private ProductRepository productRepository;
 
 @Autowired
 private ItemInfoRepository itemInfoRepository;
 
 @Autowired
 private ItemReviewRepository itemReviewRepository;
 
 public Booking create(Booking booking) {
  booking.setTravelDate(new Date());
  booking = bookingRepository.save(booking);
     return booking;
 }
 
 public Booking read(Long bookingId) {
  Booking booking = bookingRepository.findOne(bookingId);
     return booking;
 }
 
 public Booking update(Long bookingId, String psngrName) {
  Booking booking = bookingRepository.findOne(bookingId);
  booking.setPsngrName(psngrName);
  booking = bookingRepository.save(booking);
     return booking;
 }
 
 public String delete(Long bookingId) {
  bookingRepository.delete(bookingId);
     return "booking #"+bookingId+" deleted successfully";
 }

 public String find(String departure) {
	  bookingRepository.findByDeparture(departure);
	     return "booking #"+departure+" find successfully";
	 }		

 public Product createProduct(Product product) {

	 product = productRepository.save(product);
	     return product;
	 }
 
 public String findItem(Long itemId) {
	  itemInfoRepository.findByItemId(itemId);
	     return "item #"+itemId+" find successfully";
	 }		

public ItemInfo createItem(ItemInfo itemInfo) {

	itemInfo = itemInfoRepository.save(itemInfo);
	     return itemInfo;
	 }
	 
 
public String findItemReview(Long itemId) {
	  itemReviewRepository.findByItemId(itemId);
	     return "item #"+itemId+" find successfully";
	 }		

public ItemReview createItemReview(ItemReview itemReview) {

	itemReview = itemReviewRepository.save(itemReview);
	     return itemReview;
	 }

}
 