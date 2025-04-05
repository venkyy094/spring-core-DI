package com.venkatesh.it;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInformation {
		private int orderId;
		private List<String>productNames;
		private List<Integer>releaseYears;
		private Set<String>emailIds;
		private Map<String, Double>ProductsAndPrices;
		
		public OrderInformation() {
			System.out.println("orderinformation created");
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			System.out.println("orderinformation setOrderId is called with value: "+orderId);
			this.orderId = orderId;
		}
		public List<String> getProductNames() {
			return productNames;
		}
		public void setProductNames(List<String> productNames) {
			System.out.println("orderinformation setProductNames is called with value: "+productNames);
			this.productNames = productNames;
		}
		public List<Integer> getReleaseYears() {
			return releaseYears;
		}
		public void setReleaseYears(List<Integer> releaseYears) {
			this.releaseYears = releaseYears;
		}
		public Set<String> getEmailIds() {
			return emailIds;
		}
		public void setEmailIds(Set<String> emailIds) {
			this.emailIds = emailIds;
		}
		public Map<String, Double> getProductsAndPrices() {
			return ProductsAndPrices;
		}
		public void setProductsAndPrices(Map<String, Double> productsAndPrices) {
			ProductsAndPrices = productsAndPrices;
		}
		
		
		
		
	
		
		

}
