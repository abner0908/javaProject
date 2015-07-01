package exception;

import java.io.*;

public class JavaException13_6 {

	private static void try_finally() throws FileNotFoundException {
		FileInputStream fis = null;
		BufferedReader reader = null;
		try {
			fis = new FileInputStream(new File("FileName"));
			reader = new BufferedReader(new InputStreamReader(fis));
			// do something
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// log the exception
				}
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// log the exception
				}
		}
	}

	public static void main(String[] args) {

		try {
			try_finally();
		} catch (Exception e) {

		}
	}

}
