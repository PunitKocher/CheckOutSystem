package Test;


import static java.util.Arrays.asList;
import org.junit.Test;
import org.main.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestShoppingCart {
	
	@Test
	public void test(){
		ShoppingCartCheckout test=new ShoppingCartCheckout();
		
		// With Offer
		assertThat("1 Apple", test.printReceiptWithOffer(asList("Apple")), is("£0.60"));
		assertThat("3 Apple,1 Orange", test.printReceiptWithOffer(asList("Apple","Apple","Orange","Apple")), is("£1.45"));
		assertThat("3 Apple,1 Orange", test.printReceiptWithOffer(asList("Orange","Orange","Orange")), is("£0.50"));
		assertThat("3 Apple,1 Orange", test.printReceiptWithOffer(asList("Apple","Apple")), is("£0.60"));
		
		//Without Offer
		assertThat("1 Apple", test.printReceiptWithoutOffer(asList("Apple")), is("£0.60"));
		assertThat("2 Apple", test.printReceiptWithoutOffer(asList("Apple","Apple")), is("£1.20"));
		assertThat("3 Orange", test.printReceiptWithoutOffer(asList("Orange","Orange","Orange")), is("£0.75"));
		
				
		
	}

}
