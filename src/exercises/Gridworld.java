package exercises;

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import java.awt.Color;
import java.util.Random;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {

	public static void main(String[] args) {

		World<Actor> gridW = new World<Actor>();
		gridW.show();

		Bug buggy1 = new Bug();
		Location poisition1 = new Location(5, 5);
		gridW.add(poisition1, buggy1);

		Random rand = new Random();
		int x = rand.nextInt(9) + 1;
		int y = rand.nextInt(9) + 1;
		Location position2 = new Location(x, y);
		Bug buggy2 = new Bug(Color.BLUE);
		buggy2.turn();
		buggy2.turn();
		gridW.add(position2, buggy2);

		Flower bloom = new Flower(Color.WHITE);
		Location position3 = new Location(x, y - 1);
		Location position4 = new Location(x, y + 1);
		gridW.add(position3, bloom);
		gridW.add(position4, bloom);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location position5 = new Location(i, j);
				gridW.add(position5, bloom);
			}
		}

	}
}
