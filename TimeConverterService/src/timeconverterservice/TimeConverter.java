package timeconverterservice;

public class TimeConverter {
	private double time;

	public TimeConverter(double time) {
		this.time = time;
	}
	public double msToSec() {
		return time / 1000;
	}
	public double secToMs() {
		return time * 1000;		
	}
	public double minToSec() {
		return time * 60;
	}
	public double secToMin() {
		return time / 60;
	}
	public double hrsToMin() {
		return time * 60;
	}
	public double minToHrs() {
		return time / 60;
	}
}

