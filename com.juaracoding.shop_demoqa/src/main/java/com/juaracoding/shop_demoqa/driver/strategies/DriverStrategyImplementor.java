package com.juaracoding.shop_demoqa.driver.strategies;

import com.juaracoding.shop_demoqa.utils.Constants;

public class DriverStrategyImplementor {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();

		case Constants.FIREFOX:
			return new FireFox();

		default:
			return null;
		}
	}
}
