import java.util.Scanner;

public class PrimeiroEUltimoVetor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();
        int menor = 0, maior = 0, posicaoMenor = 0, posicaoMaior = 0, numero, aux;
        int[] vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++){
            numero = entrada.nextInt();
            if(numero > maior){
                maior = numero;
                posicaoMaior = i;
            }else if(numero < menor){
                menor = numero;
                posicaoMenor = i;
            }
            vetor[i] = numero;
        }
        aux = vetor[0];
        vetor[0] = vetor[posicaoMenor];
        vetor[posicaoMenor] = aux;

        aux = vetor[quantidade-1];
        vetor[quantidade-1] = vetor[posicaoMaior];
        vetor[posicaoMaior] = aux;

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
