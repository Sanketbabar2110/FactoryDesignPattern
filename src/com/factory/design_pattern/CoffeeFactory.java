package com.factory.design_pattern;

import com.coffees.Breve;
import com.coffees.Cappuccino;
import com.coffees.ColdBrew;
import com.coffees.Espresso;
import com.coffees.RedEye;

public class CoffeeFactory {

	public Coffee createCoffee(CoffeeType type) {
		
		Coffee coffee = null;
		
		switch (type) {

		case BREVE:
			coffee = new Breve();
			break;

		case CAPPUCCINO:
			coffee = new Cappuccino();
			break;

		case COLDBREW:
			coffee = new ColdBrew();
			break;

		case ESPRESSO:
			coffee = new Espresso();
			break;

		case RED_EYE:
			coffee = new RedEye();
			break;
		}

		return coffee;

	}
}
