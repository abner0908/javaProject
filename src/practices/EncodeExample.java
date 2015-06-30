package practices;
import java.io.*;
public class EncodeExample {

	public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(args[0]);
        byte[] one = new byte[1];
        byte[] two = new byte[2];
        while(in.read(one) != -1) {
            int range = one[0] & 0x00FF;
            System.out.printf("%h ", range); 
            if(range >= 0xA4 && range < 0xF9) {
                two[0] = one[0];
                in.read(one);
                System.out.printf("%h ", one[0] & 0x00FF);
                two[1] = one[0];
                System.out.println(new String(two));
            }
            else {
                System.out.println("   " + new String(one));
            }
        }
        in.close();

	}

}
