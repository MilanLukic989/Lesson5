package optional;

//1. Make an instance of your new pet platypus
//2. Call the sayHi method
//3. Create a constructor in the platypus class so that you can give your platypus a name.

public class Platypus {

	private String name;

	public Platypus(String name) {
		this.name = name;
	}

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}

	public static void main(String[] args) {
		Platypus platypus = new Platypus("Plato");
		platypus.sayHi();
		
	}
}
