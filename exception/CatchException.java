package asg08.exception;

import java.io.IOException;

public class CatchException {
	
	public void throwExceptionA () throws ExceptionA  {
		throw new ExceptionA();
	}
	
	public void throwExceptionB () throws ExceptionB {
		throw new ExceptionB();
	}
	
	public void throwIOException () throws IOException {
		throw new IOException();
	}
	
	public void catchException() {
		
		
		try{
			new CatchException().throwExceptionB();
			new CatchException().throwExceptionA();
			new CatchException().throwIOException();
			throw new NullPointerException(); 		
		}
		catch(ExceptionB b) {
			b.printStackTrace();
		}
		catch(ExceptionA a) {
			a.printStackTrace();
		}
		catch(NullPointerException nulException) {
			nulException.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
}
