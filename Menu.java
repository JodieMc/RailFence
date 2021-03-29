package ie.gmit.dip;

import java.util.Scanner;

public class Menu {// Handles command line driven menu
	private RailFenceCypher rfc = new RailFenceCypher();// Now methods in this class accessible to the menu class
	private FileHandler fh;

	public void start() {

	}

	// Instance variables should always be private
	private Scanner scanner = null;// Takes in user input
	private boolean keepRunning = true;

	public Menu() {// Constructor
		scanner = new Scanner(System.in);// Input stream: allows you to read things in from the console

		// do/for loop: as don't know the number or iterations
		do {
			this.initMenu();
			this.processInput();
		} while (keepRunning); // Stops the program dying

	}

	private void selectFileOrURL() {
		System.out.println("[INFO] Enter file or URL");

	}

	private void enterRailFenceKey() {
		System.out.println("[INFO] Rail Fence Key");
		System.out.println("Enter number of rows");
		System.out.println("Enter the offset");

	}

	private void encrypt() {
		System.out.println("[INFO] Encrypting");
		setFh(new FileHandler(new RailFenceCypher(0, 0, 0)));
	}

	private void decrypt() {
		System.out.println("[INFO] Decrypting");
		setFh(new FileHandler(new RailFenceCypher(0, 0, 0)));
	}

	private void displayRailFence() {
		System.out.println("[INFO] Displaying Rail Fence");
		setFh(new FileHandler(new RailFenceCypher(0, 0, 0)));
	}

	private void processInput() {
		String input = scanner.next();// Blocking method
		int choice = Integer.parseInt(input);
		if (choice == 1) {
			this.selectFileOrURL();
		} else if (choice == 2) {
			this.enterRailFenceKey();
		} else if (choice == 3) {
			this.encrypt();
		} else if (choice == 4) {
			this.decrypt();
		} else if (choice == 5) {
			this.displayRailFence();
		} else if (choice == 6) {
			System.out.println("Quitting...");
			keepRunning = false; // Avoids a hard exit
		} else {
			System.out.println("Invalid..."); // If the user makes an invalid selection this will catch it
		}
	}

	private void initMenu() {
		System.out.println("-------------------------");
		System.out.println("**Rail Fence Cipher 1.0**");
		System.out.println("-------------------------");
		System.out.println("1.Select File or URL");
		System.out.println("2.Enter Rail Fence Key");
		System.out.println("3.Encrypt");
		System.out.println("4.Decrypt");
		System.out.println("5.Display Rail Fence");
		System.out.println("6.Quit");
		System.out.println("Select option [1-6]>");

	}

	public FileHandler getFh() {
		return fh;
	}

	public void setFh(FileHandler fh) {
		this.fh = fh;
	}

	public RailFenceCypher getRfc() {
		return rfc;
	}

}