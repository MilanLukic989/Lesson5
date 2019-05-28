package exercises;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf handy = new Smurf("Handy");
		System.out.println(handy.getName());
		handy.eat();
		handy.getHatColor();
		handy.isGirlOrBoy();
		System.out.print("\n");
		
        Smurf papa = new Smurf("Papa");
        System.out.println(papa.getName());
		papa.eat();
		papa.getHatColor();
		papa.isGirlOrBoy();
		System.out.print("\n");
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		smurfette.eat();
		smurfette.getHatColor();
		smurfette.isGirlOrBoy();

	}

}
