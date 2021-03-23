interface test{
	int division(int a, int b);
	int modules(int a, int b);
}

class Question1 implements test {
	public int division(int a, int b) {
		int c = b / a;
		return c;
	}
	public int modules(int a, int b) {
		int c= b % a;
		return c;
	}
	
	public static void main (String[] args) {
		Question1 obj = new Question1();
		int result = obj.division(56, 502066432);
		int result1 = obj.modules(13, 166);
		System.out.println("Ay yo the division of b by a is " + result + " fam.");
		System.out.println("Ay yo the modules is " + result1 + " fam.");
		
	}

}
