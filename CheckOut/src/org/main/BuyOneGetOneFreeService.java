package org.main;

public class BuyOneGetOneFreeService {
	private int singleItemPrice;

	public BuyOneGetOneFreeService(int singleItemPrice) {
		this.singleItemPrice = singleItemPrice;
		
	}

	public int calculateAmount(int noOfItems) {
		return (noOfItems/2)* singleItemPrice + (noOfItems%2)* singleItemPrice;
	}
}
