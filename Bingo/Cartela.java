import java.io.FileWriter;
import java.util.Random;

public class Cartela {
    static Random gerador = new Random();
    String [][] matriz_da_cartela = new String[5][5];
    //Vetor que contabiliza os números que já foram inseridos durante a criação (aleatória) para alocá-los sem repetição na cartela
    int [] vetor_numeros_ja_preenchidos = new int[25];
    //Vetor vai contabilizar os números que já foram acertados, isso vai ser útil futuramente
    int [] vetor_numeros_acertados = new int[25];
    //Vetor que vai contabilizar a quantidade de acertos por linha.
    int [] acertos_por_linha = new int[5];
    //Vetor que vai contabilizar a quantidade de acertos por coluna.
    int [] acertos_por_coluna = new int[5];
    //Variavel para auxiliar no nosso jogo completo
    int pontuacao_total = 0;
    int id;
    //Cria uma cartela, dá um ID para ela (Sequencial), chama os métodos para gerar os valores e criar o arquivo.
    public Cartela(int id){
        this.id = id;
        gera_valores();
        inserir_cartela_arquivo();
    }
    //Esse método faz a criação de cada cartela e fomenta os valores de forma aleatória, está funcionando
    //Necessário separar em outros métodos esse método gera_valores()
    public void gera_valores(){
        int min = 1, max = 15, numero_gerado = 0, index = 0;
        String numero_formatado =" ";
        boolean flag = false;
        for (int i = 0; i < matriz_da_cartela.length; i++) {
            for (int j = 0; j < matriz_da_cartela[0].length ; j++) {
                while(!flag){
                    numero_gerado = gerador.nextInt((max - min) + 1) + min;
                    for (int numero_ja_sorteado : vetor_numeros_ja_preenchidos) {
                        if(numero_ja_sorteado == numero_gerado){
                            flag = false;
                            break;
                        }else{
                            flag = true;
                        }
                    }

                }
                //Faz a formatação para os números que tiverem só um digito ficarem com o zero na esquerda
                if(flag){
                    if(numero_gerado < 10){
                        numero_formatado = "0"+ numero_gerado;
                    }else{
                        numero_formatado = String.valueOf(numero_gerado);
                    }
                    //O número inserido é alocado no vetor que vê os números já gerados aleatoriamente para não repetir
                    //E por fim salva na cartela e vai para o próximo.
                    vetor_numeros_ja_preenchidos[index] = numero_gerado; index++;
                    matriz_da_cartela[j][i] = numero_formatado;
                }else{
                    j--;
                }
                flag = false;
            }
            //Para gerar nosso intervalo por cada coluna (de 1 à 15, de 16 à 30, de 31 à 45, de 46 à 60, de 61 à 75).
            min += 15;
            max += 15;
        }
        //Desconsiderar a posição do "miolo", e considera para a respectiva linha e coluna um acerto já garantido.
        matriz_da_cartela[2][2] = "XX";acertos_por_linha[2] = 1;acertos_por_coluna[2] = 1;
    }
    //Método para criar o arquivo da cartela
    public void inserir_cartela_arquivo(){
        try{
            FileWriter escritor = new FileWriter("src/cartelas/cartela"+id+".txt");
            for (int i = 0; i < matriz_da_cartela.length; i++) {
                for (int j = 0; j < matriz_da_cartela[0].length ; j++) {
                    escritor.write(matriz_da_cartela[i][j]+" ");
                }
                escritor.write("\n");
            }
            escritor.close();
        }catch (Exception e){
            System.out.println("Erro");
        }
    }
}
