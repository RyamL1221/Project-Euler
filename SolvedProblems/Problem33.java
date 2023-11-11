// ANSWER: 100
class Problem33 {
	public static void main(String[] args) {
		Fraction[] answers = new Fraction[4]; 
		int nextIndex = 0;
		Fraction answer = new Fraction(1, 1);
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				for (int z = 1; z <= 9; z++) {
					Fraction f1 = new Fraction(x * 10 + y, z * 10 + x);
					Fraction f2 = new Fraction(y * 10 + x, x * 10 + z);
					Fraction f3 = new Fraction(y, z);
					if (f1.getNumerator() < f1.getDenominator() && f1.isEqualTo(f3)) {
						answers[nextIndex] = f1;
						nextIndex++;
					}
					if (f2.getNumerator() < f2.getDenominator() && f2.isEqualTo(f3)) {
						answers[nextIndex] = f2;
						nextIndex++;
					}
				}
			}
		}
		for (Fraction f : answers) {
			answer = answer.multiply(f);
		}
		answer.simplify();
		System.out.println(answer);
	}
}