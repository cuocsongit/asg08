package asg08.exception;

public class ExceptionB extends ExceptionA {
	public ExceptionB() {
		this("This is exceptionB");
	}
	
	public ExceptionB(String name) {
		super(name);
	}
}
