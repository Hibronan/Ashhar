package weightconverterservice;

public class WeightConverter {
	private double value;
	public WeightConverter(double value) {
		this.value = value;
	}
	public double KgTog() {
		return (value * 1000.0);
	}
	public double gToKg() {
		return (value * 0.001);
	}
	public double TonneToKg() {
		return (value * 1000);
	}
	public double KgToTonne() {
		return (value * 0.001);
	}
	public double PoundstoKg() {
		return (value * 0.453592);
	}
	public double KgToPounds() {
		return (value * 2.20462);
	}
	public double OunceToPounds() {
		return (value * 0.0625);
	}
	public double PoundsToOunce() {
		return (value * 16);
	}
	public double gToOunce() {
		return (value * 0.035274);
	}
	public double OunceToGram() {
		return (value * 28.3495);
	}
}
