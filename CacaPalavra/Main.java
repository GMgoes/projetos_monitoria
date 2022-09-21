import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma palavra secreta");
        String palavra_secreta = entrada.next();

        PalavraSecreta t1 = new PalavraSecreta();

        t1.encontra_palavra_secreta(palavra_secreta);

    }
}