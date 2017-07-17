package com.niit.springboot.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shashank.Shukla
 *
 */
@Entity
@Table(name = "ItemReview")
public class ItemReview implements Serializable{

 /**
  * 
  */
 private static final long serialVersionUID = 1L;
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 Long itemId;
 @Column
 String comment;


 public Long getItemId() {
  return itemId;
 }

 public void setItemId(Long itemId) {
  this.itemId = itemId;
 }

 public String getComment() {
  return comment;
 }

 public void setComment(String comment) {
  this.comment = comment;
 }

}