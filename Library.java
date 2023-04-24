package oophw4Library;

public class Library {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("Louise");
		customer1.setId(1);
		customer1.setPhoneNumber("0403262226");

		Customer customer2 = new Customer();
		customer2.setName("Daniel");
		customer2.setId(2);
		customer2.setPhoneNumber("0403165567");

		Customer customer3 = new Customer();
		customer3.setName("Victor");
		customer3.setId(3);
		customer3.setPhoneNumber("0403265314");

		Customer[] customers = { customer1, customer2, customer3 };
		Book book1 = new Book();
		book1.setName("Anne of Green Gables");
		book1.setAuthor("Lucy Maud Montgomery");
		book1.setIsbn(1);
		book1.setStock(5);

		Book book2 = new Book();
		book2.setName("The little prince");
		book2.setAuthor("Antoine de Saint-Exupéry");
		book2.setIsbn(2);
		book2.setStock(3);

		Book book3 = new Book();
		book3.setName("Secret garden");
		book3.setAuthor("Frances Hodgson Burnett");
		book3.setIsbn(3);
		book3.setStock(6);

		Book book4 = new Book();
		book4.setName("The Lost World");
		book4.setAuthor("Sir Author Conan Doyle");
		book4.setIsbn(4);
		book4.setStock(2);

		Book[] books = { book1, book2, book3, book4 };

		Type type1 = new Type();
		type1.setId(1);
		type1.setName("Classic");

		Type type2 = new Type();
		type2.setId(2);
		type2.setName("Fiction");

		Type type3 = new Type();
		type3.setId(3);
		type3.setName("Chilren");

		Type type4 = new Type();
		type4.setId(4);
		type4.setName("Philosophy");

		Type type5 = new Type();
		type5.setId(4);
		type5.setName("Science");

		Type type6 = new Type();
		type6.setId(4);
		type6.setName("Adventure");

		Type[] types = { type1, type2, type3, type4, type5, type6 };

		// Booktype 1
		BookType book1Type1 = new BookType();
		book1Type1.setBook(book1);
		book1Type1.setType(type1);

		BookType book1Type2 = new BookType();
		book1Type2.setBook(book1);
		book1Type2.setType(type3);

		// Booktype 2
		BookType book2Type1 = new BookType();
		book2Type1.setBook(book2);
		book2Type1.setType(type2);

		BookType book2Type2 = new BookType();
		book2Type2.setBook(book2);
		book2Type2.setType(type4);

		// Booktype 3
		BookType book3Type1 = new BookType();
		book3Type1.setBook(book3);
		book3Type1.setType(type1);

		BookType book3Type2 = new BookType();
		book3Type2.setBook(book3);
		book3Type2.setType(type3);

		// Booktype 4
		BookType book4Type1 = new BookType();
		book4Type1.setBook(book4);
		book4Type1.setType(type5);

		BookType book4Type2 = new BookType();
		book4Type2.setBook(book4);
		book4Type2.setType(type6);

		BookType book4Type3 = new BookType();
		book4Type3.setBook(book4);
		book4Type3.setType(type2);

		BookType[] bookTypes = { book1Type1, book1Type2, book2Type1, book2Type2, book3Type1, book3Type2, book4Type1,
				book4Type2, book4Type3 };

		// Location
		Location location1 = new Location();
		location1.setAddress("aisle 1 shelve 2");
		location1.setId(012);

		Location location2 = new Location();
		location2.setAddress("aisle 4 shelve 6");
		location2.setId(046);

		Location location3 = new Location();
		location3.setAddress("aisle 2 shelve 3");
		location3.setId(023);

		Location[] locations = { location1, location2, location3 };

		// BookLocation
		BookLocation book1Loc1 = new BookLocation();
		book1Loc1.setBook(book1);
		book1Loc1.setLocation(location1);

		BookLocation book1Loc2 = new BookLocation();
		book1Loc2.setBook(book1);
		book1Loc2.setLocation(location3);

		BookLocation book2Loc1 = new BookLocation();
		book2Loc1.setBook(book2);
		book2Loc1.setLocation(location2);

		BookLocation book2Loc2 = new BookLocation();
		book2Loc2.setBook(book2);
		book2Loc2.setLocation(location1);

		BookLocation book3Loc1 = new BookLocation();
		book3Loc1.setBook(book3);
		book3Loc1.setLocation(location3);

		BookLocation[] bookLocations = { book1Loc1, book1Loc2, book2Loc1, book2Loc2, book3Loc1 };

		// BorrowList
		BorrowedList cus1Borrow1 = new BorrowedList();
		cus1Borrow1.setCustomer(customer1);
		cus1Borrow1.setBook(book1);
		cus1Borrow1.setId(1);
		cus1Borrow1.setDateBorrwed("03/04/2023");
		cus1Borrow1.setBorrow(true);
		cus1Borrow1.setDateReturned(null);

		BorrowedList cus1Borrow2 = new BorrowedList();
		cus1Borrow2.setCustomer(customer1);
		cus1Borrow2.setBook(book3);
		cus1Borrow2.setId(2);
		cus1Borrow2.setDateBorrwed("08/04/2023");
		cus1Borrow2.setBorrow(false);
		cus1Borrow2.setDateReturned("10/04/2023");

		BorrowedList cus2Borrow1 = new BorrowedList();
		cus2Borrow1.setCustomer(customer2);
		cus2Borrow1.setBook(book4);
		cus2Borrow1.setId(3);
		cus2Borrow1.setDateBorrwed("06/04/2023");
		cus2Borrow1.setBorrow(false);
		cus2Borrow1.setDateReturned("14/04/2023");

		BorrowedList cus2Borrow2 = new BorrowedList();
		cus2Borrow2.setCustomer(customer2);
		cus2Borrow2.setBook(book1);
		cus2Borrow2.setId(4);
		cus2Borrow2.setDateBorrwed("06/04/2023");
		cus2Borrow2.setBorrow(true);
		cus2Borrow2.setDateReturned(null);

		BorrowedList cus3Borrow1 = new BorrowedList();
		cus3Borrow1.setCustomer(customer3);
		cus3Borrow1.setBook(book3);
		cus3Borrow1.setId(5);
		cus3Borrow1.setDateBorrwed("06/04/2023");
		cus3Borrow1.setBorrow(true);
		cus3Borrow1.setDateReturned(null);

		BorrowedList cus3Borrow2 = new BorrowedList();
		cus3Borrow2.setCustomer(customer3);
		cus3Borrow2.setBook(book2);
		cus3Borrow2.setId(6);
		cus3Borrow2.setDateBorrwed("14/04/2023");
		cus3Borrow2.setBorrow(false);
		cus3Borrow2.setDateReturned("20/04/2023");

		BorrowedList[] borrowedLists = { cus1Borrow1, cus1Borrow2, cus2Borrow1, cus2Borrow2, cus3Borrow1, cus3Borrow2 };

		System.out.println("List of borrowed books");
		for (BorrowedList borrow : borrowedLists) {
			System.out.println("ID: " + borrow.getId());
			System.out.println("Book name: " + borrow.getBook().getName());
			System.out.println("Customer name: " + borrow.getCustomer().getName());
			System.out.println("Date borrowed: " + borrow.getDateBorrwed());
			if (!borrow.isBorrow()) {
				System.out.println("Date returned: " + borrow.getDateReturned());
			} else {
				System.out.println("This book has not been returned by the customer");
			}
		}

		for (Book book : books) {
			System.out.println("Book name:" + book.getName());
			System.out.println("**************");
			for (BorrowedList borrow : borrowedLists) {
				if (borrow.getBook().name.equals(book.getName())) {

					System.out.println("Customer name: " + borrow.getCustomer().getName());
					System.out.println("Date borrowed: " + borrow.getDateBorrwed());
					if (!borrow.isBorrow()) {
						System.out.println("Date returned: " + borrow.getDateReturned());
					} else {
						System.out.println("Date returned: This book has not been returned by the customer");
					}
					System.out.println("__________");
				}

			}
		}

	}

}
