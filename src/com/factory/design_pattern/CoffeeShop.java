package com.factory.design_pattern;

public class CoffeeShop {

	private final CoffeeFactory coffeeFactory;

	public CoffeeShop(CoffeeFactory coffeeFactory) {
		super();
		this.coffeeFactory = coffeeFactory;
	}

	public Coffee orderCoffee(CoffeeType type) {
		Coffee coffee = coffeeFactory.createCoffee(type);
		coffee.grindCoffee();
		coffee.makeCoffee();
		coffee.pourIntoCup();

		System.out.println("\"Here's your coffee! Thanks! Come again!\"");

		return coffee;
	}
}
