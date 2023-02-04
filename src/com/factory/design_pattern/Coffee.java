package com.factory.design_pattern;

public interface Coffee {
			
		// Grind the coffee
	default void grindCoffee() {
		System.out.println("Coffee Beans are Grinded here!!!");
	}
        
		// Brew the coffee
    default void makeCoffee() {
    	System.out.println("Making coffee!!!");
    }
    
    	// Pour into a cup
    default void pourIntoCup() {
    	System.out.println("Pouring coffee into the cup!!!");
    }
}
