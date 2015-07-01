package exception;

public class JavaException20_1_2 {
	// 符合declare的要求
	private void foo1() throws MyException {
		throw new MyException();
	}

	// 符合handle rule
	private void foo2() throws MyException {
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO: handle exception
		}
	}

	private void deposit(int value) {
		if (value < 0) {
			throw new IllegalArgumentException();
		}
	}
}

class MyException extends Exception {
}

class IllegalArgumentException extends RuntimeException {

}