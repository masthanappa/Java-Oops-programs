package com.kn.composition;

public class Book {
	
	
 Page page;
 
 public  Book(String content) {
	 this.page= new  Page(content);
 }
   public void readBook() {
	   System.out.println("Book reading is in progress....");
	   page.displyContent();
   }
 }

