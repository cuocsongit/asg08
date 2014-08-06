package asg08.account;


public class AccountDemo {
	public static void main(String[] args) {
		
		try {
			NormalAccount account = new NormalAccount(-10);
		} 
		catch (InvalidAmountException e) {
			System.out.println(e);
		} 
		
		try{
			NickleNDime acc = new NickleNDime(100);
			System.out.println(acc.getBalance());
			acc.withdraw(150);
			System.out.println("NickleDime: "+acc.getBalance());
		} 
		catch(OverWithdrawException e){
			System.out.println(e);
		} 
		catch (InvalidAmountException e){
			System.out.println(e);
		}
	}
}
