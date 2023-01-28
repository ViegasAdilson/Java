package basic;

public class Arrays {
    public static void main(String[] args) {
        // String[] listaDeString = new String[3];
        // listaDeString[0] = "Primeira posicao do array";
        // listaDeString[1] = "Segunda posicao do array";
        // listaDeString[2] = "Terceira posicao do array";
        // System.out.println(listaDeString[0]);
        // System.out.println(listaDeString[1]);
        // System.out.println(listaDeString[2]);

        int[] saldo = new int[3];

        saldo[0] = 500;
        saldo[1] = 350;
        saldo[2] = 430;

        System.out.println("A posicao 0 mais a posicao 1 - " + (saldo[0] + saldo[1]));
        System.out.println("A posicao 0 mais a posicao 2 - " + (saldo[0] + saldo[2]));
        System.out.println("Tamanho do array saldo - " + saldo.length);
    }
}
