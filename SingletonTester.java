package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author daevtwymon@gmail.com
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIX ME: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with ???
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
