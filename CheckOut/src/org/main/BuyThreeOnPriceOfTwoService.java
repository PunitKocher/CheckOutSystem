package org.main;

public class BuyThreeOnPriceOfTwoService {
	private int singleItemPrice;
	private int noOfItems;

	public BuyThreeOnPriceOfTwoService(int singleItemPrice,int noOfItems) {
		this.singleItemPrice = singleItemPrice;
		this.noOfItems = noOfItems;
		calculateAmount();
	}

	
	public final int calculateAmount() {
		return (noOfItems/3)*2* singleItemPrice +(noOfItems%3)* singleItemPrice;
	}
}
