import java.util.Scanner;

public class NumerosRepetidosArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira uma quantia de números");
        int quantidade = entrada.nextInt();
        if(quantidade == 0){
            System.out.println("[ ]");
        }else{
            int auxiliar = 0, numero = -1, sinalizador = 0;
            int[] vetor = new int[quantidade];

            while(auxiliar != quantidade){
                numero = entrada.nextInt();
                for(int i = 0; i < vetor.length; i++){
                    if(numero == vetor[i]){
                        sinalizador++;
                    }
                }
                if(sinalizador == 0){
                    vetor[auxiliar] = numero;
                    auxiliar++;
                }else{
                    System.out.println("Número já inserido, tente novamente");
                    sinalizador = 0;
                }
            }
            for (int i = 0; i < vetor.length; i++){
                System.out.print(vetor[i]+" ");
            }
        }
    }
}
