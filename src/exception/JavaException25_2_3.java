package exception;

import java.io.*;

public class JavaException25_2_3 {

	public void writeFile1(String filePrefix, String data) throws IOException {
		FileWriter writer = null;
		File file = null;
		try {
			file = new File(filePrefix + "_" + data + "_" + ".text");
			writer = new FileWriter(file);
			writer.write(data);
		} finally {
			writer.close();
		}
	}
}
