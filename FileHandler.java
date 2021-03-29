package ie.gmit.dip;

import java.io.*;
import java.net.URL;

public class FileHandler {// Parses files, handles input/output
	private RailFenceCypher cypher;
	private FileWriter fw = null;

	public FileHandler(RailFenceCypher c) {
		cypher = c;
	}

	public String getFileLocation() {
		return getFileLocation();
	}

	public void FileParser() throws IOException {
		/*
		 * Exceptions thrown by methods, two types checked and unchecked Checked in this
		 * case - the compiler forces the developer to address
		 */
		parse(new FileInputStream(new File("file.txt")), true);
	}

	public void UrlParser() throws IOException {
		parse(new URL("http://...").openStream(), true);
	}

	// Polymorphism - can read in any input stream
	public void parse(InputStream in, boolean encrypt) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String line;

		while ((line = br.readLine()) != null) {
			String text = encrypt ? cypher.encrypt(line) : cypher.decrypt(line);
			fw.write(text);

			br.close();
			fw.close();
		}

	}
}
