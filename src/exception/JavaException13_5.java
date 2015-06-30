package exception;

import java.util.Date;
import java.io.*;
import java.text.*;
import java.net.URL;

public class JavaException13_5 {

	private static void try_multi_catch() {
		BufferedReader reader = null;
		try {
			URL url = new URL("http://teddysoft.tw/");
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);

				SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
				Date date = format.parse(line);
				date.toString();
			}
		} catch (ParseException | IOException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try_multi_catch();
	}

}
