package eclipse.cambio;

public class CurrencyConverter {
	
	public final double IOF = 1.06;
	
	public double converting(double a, double b) {
		return a * b * IOF;
	}
}