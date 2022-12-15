package project;

import java.awt.ImageCapabilities;

public enum TypeProduct {
	MACBOOK("MacBook"),
	IPHONE("iPhone"),
	IMAC("iMac"),
	APPLEWATCH("Apple Watch"),
	IPAD("iPad"),
	AIRPODS("AirPods"),
	ACCESSORIES("Accessories"),
	AUTRES("Autres");
	
	String typeProduct;
	
	TypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}
	
}
