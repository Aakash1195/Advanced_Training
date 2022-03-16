package problem1_3;

public class Main {

	public void createBooks () {
		Book[] bs = new Book [2];
		bs[0]=new Book("javaProgramming",350.00);
		bs[1]=new Book ("Let US C ",200.00);
		for (int i =0;i<bs.length;i++) {
			bs[i].display();
			
		}
	}
	
	public void showBooks() {
		createBooks();
	}
	public static void main(String[] args) {
	 
		Main M1 = new Main ();
		M1.showBooks();
	}

}
