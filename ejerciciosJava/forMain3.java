import java.util.Scanner;

// Ejercicio: escribe un programa que dado un número, sume dicho número con todos los anteriores. Por ejemplo, para el número 5 el resultado debería ser 15 (5 + 4 + 3 + 2 + 1).

public class forMain3 {
    public static void main (String[] arrgs){
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num = keyboard.nextInt();
        
        int sum = 0;
        for(int i = num; i > 0; i--){
            sum += i;
            
        }
        System.out.println("La suma de: " + num + " con todos los anteriores: " + sum );


    }
}
