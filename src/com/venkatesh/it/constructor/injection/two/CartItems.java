package com.venkatesh.it.constructor.injection.two;

import java.util.List;
import java.util.Map;

public class CartItems {
	
			private String name;
			private List<String>itemNames;
			private Map<String, Double>itemPrices;
			public CartItems() {
			System.out.println("cartitems with 0 arguments");
			}
			public CartItems(String name, List<String> itemNames) {
				super();
				this.name = name;
				this.itemNames = itemNames;
			}			
			public CartItems(String name, List<String> itemNames, Map<String, Double> itemPrices) {
				super();
				this.name = name;
				this.itemNames = itemNames;
				this.itemPrices = itemPrices;
			}
			public CartItems(String name) {
				super();
				this.name = name;
			}
			public CartItems(List<String> itemNames) {
				super();
				this.itemNames = itemNames;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public List<String> getItemNames() {
				return itemNames;
			}
			public void setItemNames(List<String> itemNames) {
				this.itemNames = itemNames;
			}
			public Map<String, Double> getItemPrices() {
				return itemPrices;
			}
			public void setItemPrices(Map<String, Double> itemPrices) {
				this.itemPrices = itemPrices;
			}
			
			
			
			
			

}
