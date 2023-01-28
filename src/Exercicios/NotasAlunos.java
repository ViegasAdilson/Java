package Exercicios;

import java.util.Scanner;

public class NotasAlunos {
    public static float[] priNota, segNota, mediaNota;

    public static void entrada(float[] arr, String a) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Insira o " + (i + 1) + " valor da nota do " + a);
            float valorInserido = teclado.nextFloat();
            arr[i] = valorInserido;
        }

    }

    public static void main(String[] args) {
        priNota = new float[10];
        segNota = new float[10];
        mediaNota = new float[10];

        entrada(priNota, "pimeiro simestre: ");
        System.out.println("================================================");
        entrada(segNota, "segundo semestre: ");

        for (int i = 0; i < mediaNota.length; i++) {
            mediaNota[i] = (priNota[i] + segNota[i]) / 2;
            System.out.println("A media do " + (i + 1) + " aluno e: " + mediaNota[i]);
        }

    }

}
