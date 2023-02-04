package com.factory.design_pattern;

public class Test {
	public static void main(String[] args) {
		CoffeeShop c = new CoffeeShop(new CoffeeFactory());
		c.orderCoffee(CoffeeType.BREVE);
	}
}
