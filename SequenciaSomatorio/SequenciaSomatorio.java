import java.util.Scanner;

public class SequenciaSomatorio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somatorio = 1, sequencia = 1;

        int n = entrada.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.print(" "+somatorio+" ");
            sequencia++;
            somatorio = somatorio + sequencia;
        }

    }
}
