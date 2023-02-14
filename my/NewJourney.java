public class NewJourney
{
	public static void main (String [] args)
	{
		StoryBook B1 = new StoryBook();
		B1.setIsbn("987-987-2201");
		B1.setBookTitle("NARUTO");
		B1.setAuthorName("MASASHI KISHIMOTO");
		B1.setPrice(200.00);
		B1.setAvaiableQuantity(500);
		B1,setCatagory("Action" );
		System.out.println("===================>>>>>>>>>>");
		System.out.println("Object ONE");
		B1.showDetails();
		System.out.println("===================>>>>>>>>>>");
		B1.sellQuantity(200);
	    System.out.println("AFTER SALE");
		B1.showDetails();
		System.out.println("");
		System.out.println("");

		System.out.println("<<<<<<<<<<<<<<===================>>>>>>>>>>");
		System.out.println("Object Two");
		StoryBook B2 = new StoryBook("987-987-2201","ATTACK ON TITAN","HAJIME ISAYAMA",399.00,150);
		System.out.println("ISBN :"+B2.getIsbn());
		System.out.println("TITLE :"+B2.getBookTitle());
		System.out.println("AUTHORE  NAME :"+B2.getAuthorName());
		System.out.println("PRICE :"+B2.getPrice());		
		System.out.println("QUANTITY :"+B2.getAvailableQuantity());

		System.out.println("<<<<<<<<<<<===================>>>>>>>>>>");
		B2.sellQuantity(39);
	    System.out.println("AFTER SALE");
		B2.showDetails();
		System.out.println("");
		System.out.println("");
		System.out.println("<<<<<<<<<<<===================>>>>>>>>>>");
		B2.addQuantity(9);
	    System.out.println("AFTER ADD QUANTITYY");
		B2.showDetails();
	}
}