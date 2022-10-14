import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int opcao = 0; boolean carregado = false;

        Tabuleiro jogo = new Tabuleiro();

        Scanner entrada = new Scanner(System.in);

        while(opcao != 3){
            System.out.println("Informe uma opção:\n 1 - Novo Jogo \n 2 - Jogar \n 3 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    carregado = Tabuleiro.carregar_jogo_atual();
                }
                case 2 -> {
                    if(!carregado){
                        System.out.println("Carregue um jogo primeiro");
                    }else{
                        String opcao_jogadas = "";
                        jogo.fomentar_matriz();
                        System.out.println("O jogo tem: "+jogo.qtde_navios+" navios");
                        while(!opcao_jogadas.equals("00")){
                            System.out.println("\nInforme uma opção: \n 01 - Fazer uma jogada \n 11 - Ver tabuleiro \n 00 - Sair");
                            opcao_jogadas = entrada.next();
                            switch (opcao_jogadas){
                                case "11" -> {
                                    //Tabuleiro.imprimir_cabecalho();
                                    jogo.imprimir_tabuleiro();
                                }
                                case "01" -> {
                                    System.out.println("Faça uma jogada");
                                    System.out.println("Coluna e Linha, atirar");
                                    jogo.palpite(entrada.next());
                                    if(jogo.qtde_navios == 0){
                                        System.out.println("Você ganhou!!");
                                        opcao_jogadas = "00";
                                    }
                                }
                                case "00" -> {}
                            }
                        }
                    }
                }
                case 3 -> {}
            }
        }
    }
}
