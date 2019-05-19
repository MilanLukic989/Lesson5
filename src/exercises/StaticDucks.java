package exercises;

import examples.Duck;
import junit.framework.TestCase;

public class StaticDucks extends TestCase {

	public void testWeCanCountTheNumberOfDucksCreated() throws Exception {
		int numOfDucks = Duck.getNumberOfCreations();
		
		assertEquals(numOfDucks, Duck.getNumberOfCreations());   
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		Duck duck3 = new Duck();
		assertEquals(numOfDucks + 3, Duck.getNumberOfCreations());
		Duck duck4 = new Duck();
		assertEquals(numOfDucks + 4, Duck.getNumberOfCreations()); 
	}  

	public void testEverySecondDuckIsBlack() throws Exception {
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		Duck duck3 = new Duck();
		assertEquals("black", duck1.getColor());
		assertEquals("white", duck2.getColor());
		assertEquals("black", duck3.getColor());
     }

	public void testEveryFourJellyfishArePoisonous() throws Exception {
	}
}
