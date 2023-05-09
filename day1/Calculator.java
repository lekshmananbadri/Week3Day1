package week3.day1;

public class Calculator {
	public void add(int x, int y){
		System.out.println(x+y);
	}
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void multiple(int x, int y) {
		System.out.println(x * y);
	}
	public void multiple(float x, float y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(10, 5);
		calc.add(10, 5, 3);
		calc.multiple(0.2f, 0.3f);
		calc.multiple(2, 4);
	}
}

