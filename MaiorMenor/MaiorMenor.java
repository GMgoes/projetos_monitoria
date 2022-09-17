import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, maior, menor;
        numero = maior = menor = 0;

        for (int i = 0; i < 5; i++){
            numero = entrada.nextInt();
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println("Maior: "+maior);
    }
}
