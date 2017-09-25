package com.ashwani.model;

public class StockPrice {

	public String GetStockPrice(String strStockName) {
		if (strStockName.equals("mule")) {
			return "100";

		} else if (strStockName.equals("ibm")) {
			return "400";

		} else {
			return "stock does not exist";
		}
	}

}
