package Overrideclassroom;

public class Axisbank extends Bank{
	public void deposit()
	{
		System.out.println("12000 deposit in my account");
	}

	public static void main(String[] args) {
		Axisbank bnk=new Axisbank();
		bnk.deposit();

	}

}
