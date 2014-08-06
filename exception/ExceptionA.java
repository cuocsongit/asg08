package asg08.exception;

public class ExceptionA extends Exception {
	public ExceptionA() {
		this("ExceptionA");
	}
	
	public ExceptionA(String name) {
		super(name);
	}
}
