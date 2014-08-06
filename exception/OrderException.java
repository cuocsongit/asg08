package asg08.exception;

import java.io.IOException;

public class OrderException {
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
		try{
			new OrderException().throwExceptionB();
			new OrderException().throwExceptionA();
			new OrderException().throwExceptionC();	
		}
		catch(ExceptionC c) {
			c.printStackTrace();
		}
		catch(ExceptionB b) {
			b.printStackTrace();
		}
		catch(ExceptionA a) {
			a.printStackTrace();
		}
		
	}
}
