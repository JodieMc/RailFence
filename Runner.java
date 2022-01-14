package ie.gmit.dip;

public class Runner {
	private static String plainText;
	private static String cypherText;

	public static void main(String[] args) {
		// Main method executes first and allows program to run

		Menu m = new Menu(); // Creating an instance of the menu
		m.start();

		try { //Try-catch to catch an exception if it occurs and deal with it
			RailFenceCypher cypher = new RailFenceCypher();
			String cypherText = cypher.encrypt(plainText);
			System.out.println(cypherText);
			System.out.println(cypher.decrypt(cypherText));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getCypherText() {
		return cypherText;
	}

	public static void setCypherText(String cypherText) {
		Runner.cypherText = cypherText;
	}
}
