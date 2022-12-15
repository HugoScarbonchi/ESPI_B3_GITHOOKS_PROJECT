package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import project.Product;
import project.TypeProduct;

public class ProductTests {
	
	@Test
	public void createProduct() {
		Product product1 = new Product("iPhone 14 Pro", 2000000, TypeProduct.IPHONE);
		Product product2 = new Product("MacBook Pro", 2000000, TypeProduct.MACBOOK);

		assertEquals(product1.getName(), "iPhone 14 Pro");
		assertEquals(product1.getTypeProduct(), TypeProduct.IPHONE);
		assertEquals(product2.getName(), "MacBook Pro");
		assertEquals(product2.getPrice(), 2000000);
		
	}
	
	public void applyPromotion() {

		Product product2 = new Product("MacBook Pro", 2000000, TypeProduct.MACBOOK);
		product2.ajouterPromotion(10);
		Product product3 = new Product("iMac", 5000000, TypeProduct.IMAC);
		product3.ajouterPromotion(40);
		
		assertEquals(product2.getPrice(), 1999990);
		assertEquals(product3.getPrice(), 3000000);

	}
}
