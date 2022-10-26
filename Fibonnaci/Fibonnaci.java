import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int antepenultimo = 1,penultimo = 1, numero_atual;
        boolean sinalizador = false;

        System.out.print(antepenultimo+" "+penultimo +" ");
        for(int i = 2; i < numero; i++){
            numero_atual = antepenultimo+penultimo;
            if(numero_atual == numero){
                sinalizador = true;
            }
            System.out.print(numero_atual+" ");
            antepenultimo = penultimo;
            penultimo = numero_atual;
        }
        System.out.println();
        if(sinalizador){
            System.out.println("Faz parte da sequência");
        }else{
            System.out.println("Não faz parte da sequência");
        }
    }
}