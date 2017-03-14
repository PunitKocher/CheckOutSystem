package org.main;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import static java.util.Collections.frequency;

public class ShoppingCartCheckout {

	private final String APPLE = "Apple";
	private final String ORANGE = "Orange";

	public String printReceiptWithOffer(List<String> shoppingCart) {
		BigDecimal total = new BigDecimal(scanWithOffer(shoppingCart) * .01);
		System.out.println("Output with offer= "+NumberFormat.getCurrencyInstance(Locale.UK).format(total));
		return NumberFormat.getCurrencyInstance(Locale.UK).format(total);
	}
	
	public String printReceiptWithoutOffer(List<String> shoppingCart) {
		BigDecimal total = new BigDecimal(scanWithoutOffer(shoppingCart) * .01);
		System.out.println("Output without Offfer= "+NumberFormat.getCurrencyInstance(Locale.UK).format(total));
		return NumberFormat.getCurrencyInstance(Locale.UK).format(total);
	}

	private int scanWithoutOffer(List<String> shoppingCart) {

		int total = 0;
		
		//***With No offer***
		for(String str:shoppingCart){
			if(str.equalsIgnoreCase(APPLE)){
				total += OfferedCost.getPriceWithNoOffer(str);
			}else if(str.equalsIgnoreCase(ORANGE)){
				total += OfferedCost.getPriceWithNoOffer(str);
			}else{
				throw new IllegalArgumentException(str + " Item not listed for billing");
			}
		}
		
		return total;
	}
	private int scanWithOffer(List<String> shoppingCart) {

		int total = 0;
		int applesCount = frequency(shoppingCart, APPLE);
		int orangesCount = frequency(shoppingCart, ORANGE);
		
		total += OfferedCost.getPriceWithOffer(APPLE,applesCount);
		total += OfferedCost.getPriceWithOffer(ORANGE,orangesCount);
		return total;
	}



}
