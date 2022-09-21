import java.util.Arrays;
import java.util.Scanner;

public class PalavraSecreta {

    public void encontra_palavra_secreta(String palavra_secreta){

        Scanner entrada = new Scanner(System.in);

        char [] palavra_array = palavra_secreta.toCharArray();
        int total = palavra_array.length, tentativas = 5, acertos = 0;
        boolean sinalizador = false;
        char letra_escolhida;

        System.out.println(Arrays.toString(palavra_array));

        while(tentativas != 0 && acertos !=total){
            //Com a ideia do Raul
            String palavra_digitada = entrada.next();
            letra_escolhida = palavra_digitada.charAt(0);

            for(int i = 0; i < palavra_array.length; i++){
                if(palavra_digitada == palavra_secreta){
                    acertos = palavra_array.length;
                    System.out.println("Acertou a palavra inteira");
                    break;
                }
                if(palavra_array[i] == letra_escolhida){
                    System.out.println("Você acertou uma letra!!!");
                    palavra_array[i] = '*';
                    acertos++;
                    sinalizador = true;
                }
            }
            if(sinalizador == false){
                System.out.println("Você não acertou nenhuma letra");
                tentativas--;
            }
            sinalizador = false;
        }
        if(tentativas == 0){
            System.out.println("Você perdeu");
        }else{
            System.out.println("Você ganhou");
        }
    }
}
