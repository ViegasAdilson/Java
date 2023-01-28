package basic;

import java.util.Scanner;

public class SomaInt {
    public static void main(String[] args) {
        // int a;
        // int b;
        // a = 15;
        // b = 23;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a + b);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inroduza o primero numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Inroduza o segundo numero: ");
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos dois numeros que introduziu e: " + soma);

    }
}
