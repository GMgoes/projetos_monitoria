import java.util.Scanner;

public class SomaDoisArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();

        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];
        int[] vetorC = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            vetorA[i] = entrada.nextInt();
        }

        for (int i = 0; i < quantidade; i++){
            vetorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < quantidade; i++){
            vetorC[i] = vetorA[i]+vetorB[i];
        }
        System.out.print("[ ");
        for (int i = 0; i < quantidade; i++){
            System.out.print(vetorC[i]+" ");
        }
        System.out.print("]");
    }
}
