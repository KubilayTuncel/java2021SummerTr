package day35_encapsulation;

public class C03_Book {
	
	private String bookName;
	private String authorName;
	
	public void setBookName(String bookName) {
		
		this.bookName=bookName;
		
	}
	public String getBookName() {
		
		return bookName;
	}

	public void setAuthorName(String authorName) {
		authorName=authorName.substring(0,1).toUpperCase()+authorName.substring(1,authorName.length()).toLowerCase();
		this.authorName=authorName;
		
	}
	public String getAuthorName() {
		
		return authorName;
	}
}
