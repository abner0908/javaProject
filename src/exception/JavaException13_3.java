package exception;
public class JavaException13_3 {

	private static int try_finally_with_return() {
		try {
			println("excute try block");
			return 1;
		} finally {
			println("excute final block");
			return 0;
		}
	}

	public static void main(String[] args) {
		println("catch try_final_with_return : " + try_finally_with_return());
	}

	private static void println(String str) {
		System.out.println(str);
	}
}
