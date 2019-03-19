package currencyconvertorservice;

public class CurrencyConvertor {
	private double value;
	
	public CurrencyConvertor(double value) {
		this.value=value;
	}
	
	public double lkrToUsd() {
		return this.value*0.0056/1.0;
	}
	public double usdToLkr() {
		return this.value*1.0/0.0056;
	}
	public double lkrToIndianRupee() {
		return this.value*0.39/1.0;
	}
	public double indianRupeeToLkr() {
		return this.value*1.0/0.39;
	}
	public double lkrToRiyal() {
		return this.value*0.021/1.0;
	}
	public double riyalToLkr() {
		return this.value*1.0/0.021;
	}
	public double lkrToRuble() {
		return this.value*0.36/1.0;
	}
	public double rubleToLkr() {
		return this.value*1.0/0.36;
	}
	public double lkrToYen() {
		return this.value*0.62/1.0;
	}
	public double yenToLkr() {
		return this.value*1.0/0.62;
	}
	

}
