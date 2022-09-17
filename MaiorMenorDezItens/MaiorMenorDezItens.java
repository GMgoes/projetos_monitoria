import java.util.Scanner;

public class MaiorMenorDezItens {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int maior =0, menor=0, numero_informado;
        for(int i = 0; i < 10; i++){
            numero_informado = entrada.nextInt();
            if(numero_informado > maior){
                maior = numero_informado;
            }else if(numero_informado < menor){
                menor = numero_informado;
            }
        }
        System.out.println("O maior número é: "+maior+" e o menor é: "+menor);
    }
}
