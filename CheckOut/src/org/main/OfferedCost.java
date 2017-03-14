package org.main;

public class OfferedCost {
	private static final int APPLE_COST = 60;
	private static final int ORANGE_COST = 25;

	public static int getPriceWithNoOffer(String name) {
		switch(name.toLowerCase()) {
		case("apple"):
			return APPLE_COST;
		case ("orange"):
			return ORANGE_COST;
		default:
			throw new IllegalArgumentException(name + " Item not listed");
		}
	}
	
	public static int getPriceWithOffer(String name,int count) {
		switch(name.toLowerCase()) {
		case("apple"):
		     return new BuyOneGetOneFreeService(APPLE_COST).calculateAmount(count);
		case ("orange"):
		     return new BuyOneGetOneFreeService(ORANGE_COST).calculateAmount(count);
		default:
			throw new IllegalArgumentException(name + " Item not listed");
		}
	}


}
