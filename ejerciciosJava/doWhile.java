import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        
    int choose = 1;
        do {
            System.out.println("\n1 --> Gestores\n2 --> Clientes\n3 --> Transferencias\n4 --> Mensajes\n5 --> Préstamos\n6 --> Salir\n");
            System.out.print("Elige un numero de 1 a 5, o pulsa 6 para salir: " ); 
            choose = keyboard.nextInt();
            
             if (choose == 1){
                    System.out.println("Gestores");
                    System.out.println("***********************************\n");
            } else if (choose == 2) {
                    System.out.println("Clientes");
                    System.out.println("***********************************\n");
            } else if (choose == 3) {
                    System.out.println("Transferencias");
                    System.out.println("***********************************\n");
            } else if (choose == 4) {
                    System.out.println("Mensajes");
                    System.out.println("***********************************\n");
            } else if (choose == 5) {
                    System.out.println("Péstamos");
                    System.out.println("***********************************\n");
            }  else if (choose == 6) {
                    System.out.println("¡¡¡Hasta la vista!!!");
                    System.out.println("***********************************\n");
            } else {
                    System.out.println("Por favor, elige un numero de 1 a 6");
                    System.out.println("***********************************\n");
            }
        }
        while(choose != 6 );
        keyboard.close();
}}
