package basic;

import java.util.Scanner;

public class CalcularIva {
    public static final double TAXA_IVA = 0.23;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int num1 = teclado.nextInt();

        System.out.print("Insira o segundo valor: ");
        int num2 = teclado.nextInt();

        double soma_com_iva = (num1 + num2) * (1 + TAXA_IVA);
        System.out.println("A soma dos dois numeros que inseriu acrescido de iva: " + soma_com_iva);

    }
}
