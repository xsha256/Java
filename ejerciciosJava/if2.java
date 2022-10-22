
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 02;
		int b = 30;
		int c = 30;
		if (a > b && a > c) {
			System.out.println("a es mayor");
		} else if (b > a && b > c) {
			System.out.println("b es mayor");
		} else if (c > a && c > b) {
			System.out.println("c es mayor");
		} else if (a == b && a == c && b == c) {
			System.out.println("todos son iguales");
		} else {
			System.out.println("dos son iguales");
		}

	}
}
