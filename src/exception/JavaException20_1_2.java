package exception;

public class JavaException20_1_2 {
	// �ŦXdeclare���n�D
	private void foo1() throws MyException {
		throw new MyException();
	}

	// �ŦXhandle rule
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