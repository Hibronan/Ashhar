package lengthconverterservice;

public class LengthConverter {
	private double value;
	public LengthConverter(double value) {
		this.value = value;
	}
	public double mToKm() {
		return (value * 0.001);
	}
	public double KmTom() {
		return (value * 1000.0);
	}
	public double mToFeet() {
		return (value * 3.28084);
	}
	public double feetTom() {
		return (value * 0.3048);
	}
	public double inchesTocm() {
		return (value * 2.54);
	}
	public double cmtoInches() {
		return (value * 0.393701);
	}
	public double inchesTomm() {
		return (value * 25.4);
	}
	public double mmToInches() {
		return (value * 0.0393701);
	}
	public double KmToMile() {
		return (value * 0.621371);
	}
	public double MileToKm() {
		return (value * 1.60934);
	}
}
