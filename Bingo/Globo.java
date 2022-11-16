import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Globo {
    static Random gerador = new Random();
    //Essa seria a representação do globo na teoria, com todas as bolas possíveis (de 1 à 75), talvez otimizar isso
    static int [] globo_sorteado = new int[75];
    static int bola_sorteada = 0;

    static void sortear_globo(){
        for (int i = 0; i < 75; i++) {
            globo_sorteado[i] = gerador.nextInt(74) + 1;
        }
    }
    //Indice para controlarmos nosso vetor de bolas que já saíram
    static int index = 0;
    //Método que vai fazer a saída da bola sorteada
    public static int sortear_bola(){
        bola_sorteada = globo_sorteado[index];
        index++;
        return bola_sorteada;
    }
}
