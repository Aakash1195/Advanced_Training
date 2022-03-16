package problem1_3;

class Book {

	private static String book_titles ;
	private double book_price ;
	
	
	public String getBook_titles() {
		return book_titles;
	}
	public void setBook_titles(String book_titles) {
		this.book_titles = book_titles;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double b) {
		this.book_price = (float) b;
	}
	
	public Book (String book_titles,double book_price) {
		this.book_titles=book_titles;
		this.book_price=book_price;
		
	}
	
	

	public void display() {
		
		 System.out.println("book_title: "+this.book_titles);
	     System.out.println("book_price: "+this.book_price);
			
			
		}
	}

