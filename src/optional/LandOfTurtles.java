package optional;

import java.util.Random;
import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Instantiate a JFrame object & make it visible
		JFrame frame = new JFrame();
		frame.setSize(800, 600);

		// 2. Add the panel to the frame
		frame.add(panel);

		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);

		// 4. Set the size image of the frame to 600 by 400
		panel.setSize(800, 600);

		// 5. Instantiate a Turtle
		Turtle ninja = new Turtle();

		// 6. Add the turtle to the panel
		panel.addTurtle(ninja);

		frame.setVisible(true);

		// 7. Put 50 Turtles on the beach
		Random rand = new Random();
		
		for (int i = 0; i < 50; i++) {
			Turtle ninjaObj = new Turtle();
			ninjaObj.setX(rand.nextInt(750)+30);
			ninjaObj.setY(rand.nextInt(260)+300);
			panel.addTurtle(ninjaObj);
		}

	}
}
