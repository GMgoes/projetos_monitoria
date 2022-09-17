import java.util.Scanner;

public class ListaComFlag {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 0,numero = 0;
        double soma = 0;

        numero = entrada.nextInt();

        while(numero != 9999){
            soma = soma + numero;
            contador++;
            numero = entrada.nextInt();

        }
        numero = 0;

        int quantidade = entrada.nextInt();

        for(int i = 0; i < quantidade; i++){
            numero = entrada.nextInt();
            soma = soma + numero;
            contador++;
        }
        System.out.println("Media: " +soma/contador);
    }
}
