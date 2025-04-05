package com.venkatesh.it;

public class ProductInformation {
	
			private int productId;
			private String productName;
			private double price;
			private boolean isExpired;
			private char instock;
			
			
			public ProductInformation() {
				System.out.println("product is created");
			}
			
			
			public int getProductId() {
				return productId;
			}
			public void setProductId(int productId) {
				System.out.println("product setProductId is called with value: "+productId);
				this.productId = productId;
			}
			public String getProductName() {
				return productName;
			}
			public void setProductName(String productName) {
				System.out.println("product setProductName is called with value:"+productName);
				this.productName = productName;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				System.out.println("product setPrice is called with value: "+price);
				this.price = price;
			}
			public boolean getIsExpired() {
				return isExpired;
			}
			public void setIsExpired(boolean isExpired) {
				System.out.println("product setExpired is called with value:"+isExpired);
				this.isExpired = isExpired;
			}


			public char getInstock() {
				return instock;
			}


			public void setInstock(char instock) {
				System.out.println("product setInstock is called with value:"+instock);
				this.instock = instock;
			}


			@Override
			public String toString() {
				return "ProductInformation [productId=" + productId + ", productName=" + productName + ", price="
						+ price + ", isExpired=" + isExpired + ", instock=" + instock + "]";
			}


		
			
			
			
			

}
