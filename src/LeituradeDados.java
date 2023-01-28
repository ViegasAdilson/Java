import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        System.out.print("Introduza um numero e prima enter: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.println("Introduziu o numero - " + numero);
    }
}
