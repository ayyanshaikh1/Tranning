package demo;

  class Calculator{
		int add(int a, int b) {
			int sum = a+b;
			return sum;
		}
		float add(int a, float b) {
			float sum = a+b;
			return sum;
		}
		float add(float a, float b) {
			float sum = a+b;
			return sum;
		}
		double add(double a, double b) {
			double sum = a+b;
			return sum;
		}
		double add(double a, double b, double c) {
			double sum = a+b+c;
			return sum;
		}
		double add(float a, int b, double c) {
			double sum = a+b+c;
			return sum;
		}
		double add(double a, float b, int c) {
			double sum = a+b+c;
			return sum;
		}
	}

//	class CalculatorApp{
	  public class MethodOverloading {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(10, 20));

	
	}
}
