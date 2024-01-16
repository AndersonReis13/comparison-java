package entites;

public class Application {
	public int numberAcount;
	private String nameAcount;
	private double valueDeposit;
	
	
	public Application(int numberAcont, String nameAcount) {
		this.numberAcount = numberAcont;
		this.nameAcount = nameAcount;
	}
	
	public Application(int numberAcont, String nameAcount, double initialDeposit) {
		this.numberAcount = numberAcont;
		this.nameAcount = nameAcount;
		deposit(initialDeposit);
	}
	
	
	public int getNumberAcount() {
		return numberAcount;
	}
	
	public String getNameAcount() {
		return nameAcount;
	}
	public void setNameAcount(String nameAcount) {
		this.nameAcount = nameAcount;
	}
	
	public double getValueDeposit() {
		return valueDeposit;
	}
	
	public void deposit(double amount) {
		valueDeposit += amount;
	}
	
	public void witdhdrawn(double amount) {
		valueDeposit -= amount + 5.0;
	}
	
	public String toString() {
		return "Acount "
			   + numberAcount
			   + ", Holder: "
			   + nameAcount
			   +" Balance: "
			   + String.format("%.2f", valueDeposit);
	}
	

	
	
	
}
