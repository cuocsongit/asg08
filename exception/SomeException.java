package asg08.exception;

public class SomeException {
	public SomeException() throws Exception {
		throw new Exception();
	}
	public SomeException(Exception exception)  throws Exception{
		throw exception;
	}
	
	public static void main(String [] args) {
		try {
			new SomeException();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
