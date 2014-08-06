package asg08.exception;

public class ExceptionDemo {
	public void throwExceptionA () throws ExceptionA  {
		throw new ExceptionA();
	}
	
	public void throwExceptionB () throws ExceptionB {
		throw new ExceptionB();
	}
	
	public void throwExceptionC () throws ExceptionC {
		throw new ExceptionC();
	}
	
	public static void main(String [] args) {
		
		try {
			new ExceptionDemo().throwExceptionA();;
		}
		catch(ExceptionA expceptionA) {
			expceptionA.printStackTrace();
		}
		
		try {
			new ExceptionDemo().throwExceptionB();;
		}
		catch(ExceptionA expceptionA) {
			expceptionA.printStackTrace();
		}
		
		try {
			new ExceptionDemo().throwExceptionC();;
		}
		catch(ExceptionA expceptionA) {
			expceptionA.printStackTrace();
		}
	}
}
