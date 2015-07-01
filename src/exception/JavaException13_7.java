package exception;

import java.io.*;

public class JavaException13_7 {
	private static void try_with_resources() throws FileNotFoundException, IOException {
		try(FileInputStream fis = new FileInputStream(new File("FileName"));
				BufferedReader reader = new BufferedReader(new InputStreamReader(fis))){
			// do the normal processing logic
		}
	}

	public static void main(String[] args) {

	}

}
