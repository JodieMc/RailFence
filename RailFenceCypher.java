package ie.gmit.dip;

public class RailFenceCypher { // Handles matrix
	private char[][] matrix = null;
	private int offset;

	public RailFenceCypher(int key, int offset, int col) {
		matrix = new char[key][col];
	}

	/*
	 * offset Iterate over the rails, keeping in mind the starting offset of the
	 * rail if (Offset = 0){ }else{ //offset = new Offset + user input
	 */

	static public String encrypt(String s, int key) {
		char[] plainText = s.toCharArray(); // incoming string converted to char array
		char[][] cypher = new char[key][plainText.length]; // 2D array to store plainText in zigzag

		/*
		 * Must initialise, test, and increment/decrement for loop A 3D array requires 3
		 * loops Iterate over each row and then each column
		 */
		for (int i = 0; i < key; i++) // Initialise
			for (int j = 0; j < plainText.length; j++) // length is an instance variable controlled by numbers
				cypher[i][j] = 'C';

		int row = 0;
		int col = 0;

		for (int i = 0; i < plainText.length; i++) { // traverse the matrix diagonally downward and insert zigzag
														// plainText
			cypher[row][i] = plainText[i];
			if (col == 0) {// traverse diagonally downward until 0 and then increment
				row++;
				if (row == key - 1)// reach bottom of diagonal
					col = 1;
			} else {
				row--;// Diagonally upwards
				if (row == 0)
					col = 0; // Reach top of diagonal
			}
		}
		String cypher_text = "";

		for (int i = 0; i < key; i++) {
			for (int j = 0; j < plainText.length; j++) {
				if (cypher[i][j] != 'C')
					cypher_text += cypher[i][j];
			}

		}

		return cypher_text;
	}

	static public String decrypt(String s, int key) { //Decrypt

		char[] plainText = s.toCharArray();
		char[][] cypher = new char[key][plainText.length];

		for (int i = 0; i < key; i++)
			for (int j = 0; j < plainText.length; j++)
				cypher[i][j] = 'C';

		int row = 0;
		int col = 0;
		int index = 0;

		for (int i = 0; i < plainText.length; i++) {
			cypher[row][i] = 'C';

			if (col == 0) {
				row++;
				if (row == key - 1)
					col = 1;
			} else {
				row--;

				if (row == 0)
					col = 0;
			}

		}

		for (int i = 0; i < key; i++) {
			for (int j = 0; j < plainText.length; j++) {
				if (cypher[i][j] == 'C') {
					cypher[i][j] = plainText[index];
					index++;

				}
			}
		}

		String cypher_text = "";
		row = 0;
		col = 0;

		for (int i = 0; i < plainText.length; i++) {
			if (cypher[row][i] != 'C')
				cypher_text += cypher[row][i];
			if (col == 0) {
				row++;
				if (row == key - 1)
					col = 1;
			}

			else {
				row--;
				if (row == 0)
					col = 0;

			}

		}

		return cypher_text;

		// Strings are immutable, StringBuilder represents a mutable string
		StringBuilder sb = new StringBuilder(); // new keyword as all arrays are objects

		for (int i = 0; i < cypherText.length(); i++) {
			sb.append(getDecryptedCharacter(key[i], plainText.charAt(i)));
		}
		return sb.toString();
	}

	void validateText(s);
		
		StringBuilder sb = new StringBuilder();//StringBuilder is efficient
		
		for (int i = 0; i < plainText.length(); i++){
			sb.append(getEncryptedCharacter(key[i], plainText.charAt(i)));
		}
		return sb.toString();
	}

	private void validateText(String text) throws Exception {
		
	}

	return'0';

	}

	public String decrypt (String cipherText) {
	StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < cipherText.length(); i++){
			sb.append(getDecryptedCharacter(key[i], plainText.charAt(i)));
		}
		return sb.toString();}

	private char getDecryptedCharacter(char key, char cipher) {
		return '0';
	}

	/*
	 * Create an n(length of plainText) x k(key) matrix of characters. plainText
	 * characters written into the matrix in a zigzag pattern and resultant
	 * cypher-text created by appending the set of characters in each row to a
	 * String
	 */
	// Want to zigzag over the file or URL text

	
	 private char[] getPaddedKey(String s) { 
		 char[] padded = new char[s.length()];
			
		 	int index = 0; 
		 
		 for(int i = 0; int < s.length(); i++) { 
			 padded[i] = key[i];
	  		 index++;
	  
	  if (index == key.length) index = 0; {
	   return padded; }
	 

	 StringBuilder sb = new StringBuilder(); //efficiency.
	
	  for (int i = 0; i < [].length; i++) { 
			sb.append(c);  
			return sb.toString();
	  }
	

	// String efficiency within a loop

	
	 public static final int MIN_KEY_LENGTH = 3; //Allows outside to see min and max, therefore public 
	 public static final int MAX_KEY_LENGTH = 10;
	  static final int MAX GUESSES = 12; // constant - in all caps to indicate
	  constant private char[] key = null; String plainText;
	 
	 private void ValidateKey(String key) throws Exception{ 
		 if (key == null || key.length() < MIN_KEY_LENGTH || key.length() > MAX_KEY_LENGTH) { 
			 throw new Exception("[Error!] Invalid key entered. Key must be in the range ["MIN_KEY_LENGTH + "..." + MAX_KEY_LENGTH + "]."); } }
	 
			 
	 public RailFenceCypher(String key) throws Exception { setKey(key); } //converts string to a new character array
          public char[] toCharArray 
	  public void setKey(String key) throws Exception { 
	  	ValidateKey(key); this.key = key.trim().toUpperCase().toCharArray(); }
	

	public RailFenceCypher() {

	public String encrypt(String plainText) {
		return null;
	}

	public void encrypt() {

	}

}
