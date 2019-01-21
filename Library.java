class Library{
	public static void main (String[] args){
		final String appName = "Biblioteka v0.1";
		
		Book book1 = new Book();
		book1.title = "Bartek Zwyciezca";
		book1.author = "Henryk Sienkiewicz";
		book1.releaseDate = 2000;
		book1.pages = 55;
		book1.publisher = "Greg";
		book1.isbn = "838843585X";
		
		System.out.println(appName);
		System.out.println("Ksiazki dostepne w bibliotece: ");
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.releaseDate);
		System.out.println(book1.pages);
		System.out.println(book1.publisher);
		System.out.println(book1.isbn);
	}
}