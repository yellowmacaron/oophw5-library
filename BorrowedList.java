package oophw4Library;

public class BorrowedList {
	private Customer customer;
	private Book book;
	private int id;
	private String dateBorrwed;
	private boolean isBorrow;
	private String dateReturned;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateBorrwed() {
		return dateBorrwed;
	}

	public void setDateBorrwed(String dateBorrwed) {
		this.dateBorrwed = dateBorrwed;
	}

	public boolean isBorrow() {
		return isBorrow;
	}

	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}

	public String getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}

}
