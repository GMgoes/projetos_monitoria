import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ManipulacaoCartela{
    static Scanner entrada = new Scanner(System.in);
    //Vetor com os nossos objetos Cartela.
    static Cartela [] vetor_cartelas;
    //Método para gerar n cartelas, cria os objetos e aloca no vetor de cartelas.
    public static boolean gerar_cartelas(){
        System.out.println("Informe a quantidade de cartelas que deseja gerar");
        int n = entrada.nextInt();
        vetor_cartelas = new Cartela[n];
        for (int i = 1; i <= n; i++) {
            vetor_cartelas[i-1] = new Cartela(i);
        }
        return true;
    }
    //Método que realiza o "jogo" por linha
    public static void jogo_linha(){
        boolean encerrou = false;
        int id_cartela_ganhadora = 0, linha_ganhadora = 0;
        String sortear, bola_da_vez = "";
        while(!encerrou){
            System.out.println("Digite enter para sortear uma bola");
            sortear = entrada.nextLine();
            if(sortear.equals("")){
                bola_da_vez = String.valueOf(Globo.sortear_bola());
                System.out.println("A bola sorteada é a bola: "+bola_da_vez);
                for (Cartela cartela: vetor_cartelas) {
                    for (int i = 0; i < cartela.matriz_da_cartela.length; i++) {
                        for (int j = 0; j < cartela.matriz_da_cartela[0].length; j++) {
                            if(cartela.matriz_da_cartela[i][j].equals(bola_da_vez)){
                                System.out.println("Encontramos a bola:"+bola_da_vez+" na linha: "+i+" da cartela de ID: "+cartela.id);
                                cartela.matriz_da_cartela[i][j] = "XX";
                                cartela.acertos_por_linha[i]++;
                                if(cartela.acertos_por_linha[i] == 5){
                                    id_cartela_ganhadora = cartela.id;
                                    linha_ganhadora = i;
                                    encerrou = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Temos uma cartela ganhadora, e foi a de ID: "+id_cartela_ganhadora+" na linha: "+linha_ganhadora);
    }
    //Método que realiza o "jogo" por coluna.
    public static void jogo_coluna(){
        boolean encerrou = false;
        int id_cartela_ganhadora = 0, coluna_ganhadora = 0;
        String sortear, bola_da_vez = "";
        while(!encerrou){
            System.out.println("Digite enter para sortear uma bola");
            sortear = entrada.nextLine();
            if(sortear.equals("")){
                bola_da_vez = String.valueOf(Globo.sortear_bola());
                System.out.println("A bola sorteada é a bola: "+bola_da_vez);
                for (Cartela cartela: vetor_cartelas) {
                    for (int i = 0; i < cartela.matriz_da_cartela.length; i++) {
                        for (int j = 0; j < cartela.matriz_da_cartela[0].length; j++) {
                            if(cartela.matriz_da_cartela[i][j].equals(bola_da_vez)){
                                System.out.println("Encontramos a bola:"+bola_da_vez+" na coluna: "+j+" da cartela de ID: "+cartela.id);
                                cartela.matriz_da_cartela[i][j] = "XX";
                                cartela.acertos_por_coluna[j]++;
                                if(cartela.acertos_por_coluna[j] == 5){
                                    id_cartela_ganhadora = cartela.id;
                                    coluna_ganhadora = j;
                                    encerrou = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Temos uma cartela ganhadora, e foi a de ID: "+id_cartela_ganhadora+" na linha: "+coluna_ganhadora);
    }
    //Método que realiza o "jogo" por janelão
    public static void jogo_janelao(){
        boolean encerrou = false;
        int id_cartela_ganhadora = 0;
        String sortear, bola_da_vez = "";
        while(!encerrou){
            System.out.println("Digite enter para sortear uma bola");
            sortear = entrada.nextLine();
            if(sortear.equals("")){
                bola_da_vez = String.valueOf(Globo.sortear_bola());
                System.out.println("A bola sorteada é a bola: "+bola_da_vez);
                for (Cartela cartela: vetor_cartelas) {
                    for (int i = 0; i < cartela.matriz_da_cartela.length; i++) {
                        for (int j = 0; j < cartela.matriz_da_cartela[0].length; j++) {
                            if(cartela.matriz_da_cartela[i][j].equals(bola_da_vez)){
                                System.out.println("Encontramos a bola: "+bola_da_vez+" na linha: "+i+" na coluna: "+j+" da cartela de ID: "+cartela.id);
                                if(i == 0 && j == 0 || i == 0 && j == 4){
                                    cartela.acertos_por_linha[j]++;
                                    cartela.acertos_por_coluna[j]++;
                                }else if( i == 4 && j == 0 || i == 4 && j == 4){
                                    cartela.acertos_por_linha[j]++;
                                    cartela.acertos_por_coluna[j]++;
                                }else if(i == 0 || i == 4){
                                    cartela.acertos_por_linha[i]++;
                                }else{
                                    cartela.acertos_por_coluna[j]++;
                                }
                                cartela.matriz_da_cartela[i][j] = "XX";
                                if(cartela.acertos_por_coluna[0] == 5 && cartela.acertos_por_coluna[4] == 5 && cartela.acertos_por_linha[0] == 5 && cartela.acertos_por_linha[4] == 5){
                                    id_cartela_ganhadora = cartela.id;
                                    encerrou = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Temos uma cartela ganhadora, e foi a de ID: "+id_cartela_ganhadora);
    }
    //Método que realiza o "jogo" cheio
    public static void jogo_cheio(){
        boolean encerrou = false;
        int id_cartela_ganhadora = 0;
        String sortear, bola_da_vez = "";
        while(!encerrou){
            System.out.println("Digite enter para sortear uma bola");
            sortear = entrada.nextLine();
            if(sortear.equals("")){
                bola_da_vez = String.valueOf(Globo.sortear_bola());
                System.out.println("A bola sorteada é a bola: "+bola_da_vez);
                for (Cartela cartela: vetor_cartelas) {
                    for (int i = 0; i < cartela.matriz_da_cartela.length; i++) {
                        for (int j = 0; j < cartela.matriz_da_cartela[0].length; j++) {
                            if(cartela.matriz_da_cartela[i][j].equals(bola_da_vez)){
                                System.out.println("Encontramos a bola: "+bola_da_vez+" na linha: "+i+" na coluna: "+j+" da cartela de ID: "+cartela.id);
                                cartela.matriz_da_cartela[i][j] = "XX";
                                cartela.pontuacao_total++;
                                if(cartela.pontuacao_total == 25){
                                    id_cartela_ganhadora = cartela.id;
                                    encerrou = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Temos uma cartela ganhadora, e foi a de ID: "+id_cartela_ganhadora);
    }
}
