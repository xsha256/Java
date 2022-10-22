import java.util.Scanner;
public class ifMain {
	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
		System.out.println("1 --> Gestores\n2 --> Clientes\n3 --> Transferencias\n4 --> Mensajes\n5 --> Préstamos\n6 -> Salir");
		System.out.println("Elige un numero de 1 a 5, o pulsa 6 para salir");
		Scanner keyboard  = new Scanner(System.in);
		int numero = keyboard.nextInt();
		keyboard.close();

			if (numero == 1){
				System.out.println("Gestores");
			} else if (numero == 2) {
				System.out.println("Clientes");
			} else if (numero == 3) {
				System.out.println("Transferencias");
			} else if (numero == 4) {
				System.out.println("Mensajes");
			} else if (numero == 5) {
				System.out.println("Péstamos");
			}  else if (numero == 6) {
				System.out.println("Salir");
			} else {
				System.out.println("Por favor, elige un numero de 1 a 6");
			}
	}
}
