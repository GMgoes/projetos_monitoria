import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int soma = 0, contador = 0;
        double media;

        System.out.println("Informe um número");
        int numero = entrada.nextInt();
        if(numero == 0 || numero % 2 != 0){
            System.out.println("Nenhum número par diferente de 0 foi informado");
        }else{
            contador = 1;
            soma = numero;
            while(numero %2 == 0 && numero != 0){
                soma = soma + numero;
                contador++;
                numero = entrada.nextInt();
            }
            media = (soma/contador);
            System.out.println("A média é:"+media);
        }
    }
}
