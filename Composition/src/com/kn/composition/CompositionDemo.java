package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Book book = new Book("Head First java");
        
		
		book.readBook();
		
		System.out.println("------->Book got stollen");
		book = null;
	}

}
/*Book reading is in progress....
Page content is being displyed..... 
------->Book got stollen */
