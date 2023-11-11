// Comparing Fraction with a method that changes that Fraction?
public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction(Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public double toDouble() {
		return (double) numerator / denominator;
	}

	public String toString() {
		return numerator + " / " + denominator;
	}

	public Fraction multiply(Fraction f) {
		int newN = numerator * f.numerator;
		int newD = denominator * f.denominator;
		Fraction newFrac = new Fraction(newN, newD);
		return newFrac;
	}

	public void simplify() {
		int gcf = CustomMath.gcf(numerator, denominator);
		numerator /= gcf;
		denominator /= gcf;
	}
	
	public boolean isEqualTo(Fraction f) {
		Fraction a = new Fraction(this);
		Fraction b = new Fraction(f);
		a.simplify();
		b.simplify();
		if (a.toDouble() == b.toDouble())
			return true;
		else
			return false;
	}
}