package entites;

public class BusinessAccount extends Account {
	public Double leonLimit;
	
	public BusinessAccount(){
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double leonLimit) {
		super(number, holder, balance);
		this.leonLimit = leonLimit;
	}

	public Double getLeonLimit() {
		return leonLimit;
	}

	public void setLeonLimit(Double leonLimit) {
		this.leonLimit = leonLimit;
	}
	
	public void loan(double amount) {
		if(amount <= leonLimit) {
			balance += amount - 10.0;
		}
		
	}
	
	
	
}
