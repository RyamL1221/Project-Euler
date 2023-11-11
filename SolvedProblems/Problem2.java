class Problem2 {

	public static void main(String[] args) {
		int o = 2, nextTerm = 0, sum = 0;
		for (int i = 1; i < 4000000;) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (o % 2 == 0) {
				sum += o;
			}
			nextTerm = i + o;
			i = nextTerm;
			o += nextTerm;
		}
		System.out.println(sum);
	}
}