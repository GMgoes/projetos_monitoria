import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static boolean status_jogo = false;

    public static void main(String[] args) {
        boolean validacao = true;
        while (validacao) {
            menu_principal();
            switch (entrada.nextInt()) {
                case 1 -> {
                    status_jogo = ManipulacaoCartela.gerar_cartelas();
                    //System.out.println("As cartelas são:");ManipulacaoCartela.imprime_objeto_cartelas();
                }
                case 2 -> {
                    if(status_jogo){
                        //Jogando
                        menu_secundario();
                    }else{
                        System.out.println("Não foi gerado cartelas");
                    }
                }
                case 3 -> validacao = false;
            }
        }
    }
    public static void menu_principal(){
        System.out.print(
                "1 - Gerar Cartelas\n"+
                "2 - Iniciar Jogo\n"+
                "3 - Sair\n");
    }
    public static void menu_secundario(){
        int opcao_jogo = 0;
        boolean validacao = true;
        System.out.print(
                "Qual vai ser a forma de jogo?\n"+
                "A - Linha\n"+
                "B - Coluna\n"+
                "C - Janelão\n"+
                "D - Cheia\n"+
                "E - Voltar Menu Principal\n");
        while(validacao){
            Globo.sortear_globo();
            switch (entrada.next().toUpperCase(Locale.ROOT).charAt(0)) {
                case 'A' -> {
                    //Gerar jogo, vitoria com linha
                    ManipulacaoCartela.jogo_linha();
                    validacao = false;
                }
                case 'B' -> {
                    //Gerar jogo, vitoria com coluna
                    ManipulacaoCartela.jogo_coluna();
                    validacao = false;
                }
                case 'C' -> {
                    //Gerar jogo, vitoria com janelão
                    ManipulacaoCartela.jogo_janelao();
                    validacao = false;
                }
                case 'D' -> {
                    //Gerar jogo, vitoria com cheio
                    ManipulacaoCartela.jogo_cheio();
                    validacao = false;
                }
                case 'E' -> {
                    validacao = false;
                }
            }
        }
    }
}

