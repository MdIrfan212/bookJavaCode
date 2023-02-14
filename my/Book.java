public class StoryBook {
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String category;
	static double discountRate;
	StoryBook( )
	{
		
	}
	
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
String category) {
		this.isbn=isbn;
		this.bookTitle =bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.category = category;
		this.availableQuantity = availableQuantity;
	}

	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle =bookTitle;

	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setCategory(String category)
	{
	this.category = category;
	
	}	
	public String getIsbn( )
	{
		return isbn;
	}
	public String getBookTitle( )
	{
		return bookTitle;
	}
	public String getAuthorName( )
	{
		return authorName;
	}
	public double getPrice( )
	{
		return price;
	}
	public int getAvailableQuantity( )
	{
		return availableQuantity;
	}
	
	public String getCatagory( )
	{
		return category;
	}
	
	
	public void addQuantity(int amount)
	{
		this.availableQuantity+=amount;
	}
	public void sellQuantity(int amount)
	{
		this.availableQuantity-=amount;
	}
	public void showDetails( )
	{
		System.out.println ("IsBn :"+isbn);	
		System.out.println ("BookTitle :"+bookTitle);
		System.out.println ("Author Name :"+authorName);
		System.out.println ("Price :"+price);
		System.out.println ("Available Quantity :"+availableQuantity);
		System.out.println ("Category :"+category);
	}
	
}
	
	