package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import project.Store;

public class StoreTests {
	
	@Test
	public void createStore() {
		Store store1 = new Store("Apple Store Bordeaux", "2-4 Rue Sainte-Catherine, 33000 Bordeaux", 100, 150, true);
		
		assertEquals(store1.getName(), "Apple Store Bordeaux");
		assertEquals(store1.getAddress(), "2-4 Rue Sainte-Catherine, 33000 Bordeaux");
		assertEquals(store1.getNbEmployees(), 100);
		assertEquals(store1.getNbMaximumEmployees(), 150);
		assertEquals(store1.getIsOpen(), true);
		
	}
	
	@Test
	public void openTheStore() {
		Store store1 = new Store("Apple Store Bordeaux", "2-4 Rue Sainte-Catherine, 33000 Bordeaux", 100, 150, true);
		Store store2 = new Store("Apple Champs-�lys�es", "114 Av. des Champs-�lys�es, 75008 Paris", 250, 300, false);
		
		store1.openTheStore();
		store2.openTheStore();
		
		assertEquals(store1.getIsOpen(), true);
		assertEquals(store2.getIsOpen(), true);
	}
	
	@Test
	public void closeTheStore() {
		Store store1 = new Store("Apple Store Bordeaux", "2-4 Rue Sainte-Catherine, 33000 Bordeaux", 100, 150, true);
		Store store2 = new Store("Apple Champs-�lys�es", "114 Av. des Champs-�lys�es, 75008 Paris", 250, 300, false);
		
		
		store1.closeTheStore();
		store2.closeTheStore();
		
		assertEquals(store1.getIsOpen(), false);
		assertEquals(store2.getIsOpen(), false);
		assertEquals(store1.getNbEmployees(), 0);
		assertEquals(store2.getNbEmployees(), 0);
	}
	
	@Test
	public void canComeToWork() {
		
		Store store1 = new Store("Apple Store Bordeaux", "2-4 Rue Sainte-Catherine, 33000 Bordeaux", 150, 150, true);
		Store store2 = new Store("Apple Champs-�lys�es", "114 Av. des Champs-�lys�es, 75008 Paris", 250, 300, false);
		
		assertEquals(store1.canComeToWork(), false);
		assertEquals(store2.canComeToWork(), true);
	}
    
	@Test
    public void employeeComeToWork() {
    	Store store1 = new Store("Apple Store Bordeaux", "2-4 Rue Sainte-Catherine, 33000 Bordeaux", 120, 150, true);
    	
    	store1.employeeComeToWork("Emma");

		assertEquals(store1.getNbEmployees(), 121);
	}
}
