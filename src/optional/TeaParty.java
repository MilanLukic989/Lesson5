package optional;

public class TeaParty {

	TeaParty() {}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		String title;
		if (isWoman == true) {
			title = "Ms.";
		} else if (isKnighted == true) {
			title = "Sir";
		} else {
			title = "Mr.";
		}
		return "Hello " + title +" "+ name;
	}

}
