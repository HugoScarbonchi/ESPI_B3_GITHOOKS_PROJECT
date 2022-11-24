package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import project.Product;

public class ProductTests {
	
	@Test
	public void createProduct() {
		Product product1 = new Product("iPhone 14 Pro");
		Product product2 = new Product("MacBook Pro", 2000000);

		assertEquals(product1.getName(), "iPhone 14 Pro");
		assertEquals(product2.getName(), "MacBook Pro");
		assertEquals(product2.getPrice(), 2000000);
		
		/*TODO 
		 * Vérifier avec le constructeur comprenant la collection*/
	}
	
	public void applyPromotion() {

		Product product2 = new Product("MacBook Pro", 2000000);
		product2.ajouterPromotion(10);
		Product product3 = new Product("iMac", 5000000);
		product3.ajouterPromotion(40);
		
		assertEquals(product2.getPrice(), 1999990);
		assertEquals(product3.getPrice(), 3000000);

	}
}
