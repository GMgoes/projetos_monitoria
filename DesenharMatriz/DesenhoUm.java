import java.util.Scanner;

public class DesenhoUm {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int auxiliar = numero;
        for(int j = 0; j < numero; j++){
            for (int i = auxiliar; i > 0; i--){
                System.out.print(" - ");
            }
            auxiliar--;
            System.out.println();
        }
    }
}
