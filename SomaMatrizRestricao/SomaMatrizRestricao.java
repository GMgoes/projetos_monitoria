import java.util.Scanner;

public class SomaMatrizRestricao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();
        int soma = 0, numero = 0, sinalizador = 0;

        int[][] matriz = new int[quantidade][quantidade];

        for(int i = 0; i < quantidade; i++){
            for(int j = 0; j < quantidade; j++){
                numero = entrada.nextInt();
                for(int x = 0; x < quantidade; x++){
                    if(matriz[i][x] == numero){
                        sinalizador++;
                    }
                }
                if(sinalizador == 0){
                    matriz[i][j] = numero;
                }else{
                    System.out.println("Insira um número que não foi repetido nessa linha");
                    --j;
                    sinalizador = 0;
                }
            }
        }

        for(int i = 0; i < quantidade; i++){
            for(int j = 0; j < quantidade; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
