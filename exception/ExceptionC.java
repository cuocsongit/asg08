package asg08.exception;

public class ExceptionC extends ExceptionB{
	public ExceptionC() {
		this("This is exceptionC");
	}
	
	public ExceptionC(String name) {
		super(name);
	}
}
