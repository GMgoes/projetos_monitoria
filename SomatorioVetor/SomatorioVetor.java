import java.util.Scanner;

public class SomatorioVetor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, soma = 0;
        int quantidade = entrada.nextInt();
        int [] vetorNumeros = new int[quantidade];

        for(int i = 0; i < quantidade;i++){
            numero = entrada.nextInt();
            vetorNumeros[i] = numero;

        }for(int i = 0; i < vetorNumeros.length;i++){
            soma = soma + vetorNumeros[i];

        }
        System.out.println(soma);
    }
}
