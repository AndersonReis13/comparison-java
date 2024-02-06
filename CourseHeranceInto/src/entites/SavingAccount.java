package entites;

public class SavingAccount extends Account{
	private Double interestRater;
	
	public SavingAccount() {
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRater) {
		super(number, holder, balance);
		this.interestRater = interestRater;
	}

	public Double getInterestRater() {
		return interestRater;
	}

	public void setInterestRater(Double interestRater) {
		this.interestRater = interestRater;
	}
	
	public void savingAccount() {
		balance += balance * interestRater;
	}
	
}
