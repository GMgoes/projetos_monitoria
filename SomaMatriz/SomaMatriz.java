import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();
        int soma = 0;

        int[][] matriz = new int[quantidade][quantidade];

        for(int i = 0; i < quantidade; i++){
            for(int j = 0; j < quantidade; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i = 0; i < quantidade; i++){
            for(int j = 0; j < quantidade; j++){
                soma = soma + matriz[i][j];
            }
            System.out.println((i+1)+" linha: "+soma);
            soma = 0;
        }
    }
}
