package testinterface;

public abstract  class HDFC implements RBI {
	
	
	public HDFC(float amount, float duration, float interestrate) {
		
	}
	
	@Override
	public float recurringDeposit(){
		return amount()*duration()*interestrate();
	
}

}
	