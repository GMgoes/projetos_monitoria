import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] vetor = new int [5];

        //for da matriz
        /*for (int i = 0; i < 2; i++){
            for(int j = 0; j < 2;j++){
                System.out.println("Insira um número para a posição "+i+" "+j+" da matriz");
                matriz[i][j] = entrada.nextInt();
            }
        }*/
        //for do vetor
        for(int i = 0; i < 5; i++){
            System.out.println("Insira um valor para a posição "+i+" do vetor");
            vetor[i] = entrada.nextInt();
        }
        //System.out.println(ArrayUtil.localizarNumeroMatriz(matriz,5));
        //System.out.println(ArrayUtil.localizarNumero(vetor,5));

        //ArrayUtil.ordenarCrescente(vetor);
        //ArrayUtil.ordenarDecrescente(vetor);
        //ArrayUtil.ordenarSelecionado(vetor,2);
        //os exercícios de impressão não precisa codar
    }
}
