package asg08.exception;

public class ThrowBackException {
	
	public void someMethod2() throws Exception{
		throw new Exception();
	}
	
	public void someMethod() throws Exception{
		try{
			someMethod2();
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public static void main(String [] args) throws Exception{
		try {
			new ThrowBackException().someMethod();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
