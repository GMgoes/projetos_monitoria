import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    String [][] matriz = new String[10][10];
    int qtde_navios = 0;
    public static String carregar_arquivo(){
        Random random = new Random();
        int numero = random.nextInt(10)+1;
        return "src/navios/"+numero+".txt";

    }
    public static boolean carregar_jogo_atual(){
        Path carrega_jogo_atual = Paths.get("src/navios/jogoatual.txt");
        Path jogo_carregado = Paths.get(carregar_arquivo());

        try{
            Scanner leitor = new Scanner(jogo_carregado.toFile());
            FileWriter escritor = new FileWriter(carrega_jogo_atual.toFile());

            while(leitor.hasNextLine()){ escritor.write(leitor.nextLine()+"\n"); }

            escritor.close(); leitor.close();
            System.out.println("Jogo Carregado na memória, let's play");
            return true;

        }catch (IOException e){ System.out.println(e.getMessage()); }

        return false;

    }
    public void fomentar_matriz() throws FileNotFoundException {
        Path jogo_atual = Paths.get("src/navios/jogoatual.txt");
        Scanner leitor = new Scanner(jogo_atual.toFile());

        Colunas coluna_enum;
        int id = 1;
        while(leitor.hasNextLine()){
            int linha = 0, coluna = 0;
            String navios = leitor.nextLine();
            for (String navio : navios.split(",")) {
                coluna_enum = Enum.valueOf(Colunas.class,String.valueOf(navio.charAt(0)));
                coluna = coluna_enum.getValor();
                linha = Integer.parseInt(String.valueOf(navio.charAt(1)));
                matriz[linha][coluna] = String.valueOf(id);

            }
            qtde_navios++;
            id+=2;
        }
    }
    public void imprimir_tabuleiro(){
        int auxiliar = 0;
        for (String[] strings : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (strings[j] != null && !strings[j].equals("-")) {
                    if(Integer.parseInt(strings[j]) > 0){
                        if(Integer.parseInt(strings[j]) % 2 == 0){
                            System.out.print(" x ");
                        }else{
                            System.out.print(" ~ ");
                        }
                        //System.out.print(" "+strings[j]+" ");
                    }else{
                        System.out.print(" 0 ");
                    }
                }else if(strings[j] != null && strings[j].equals("-")){
                    System.out.print(" - ");
                } else{
                    System.out.print(" ~ ");
                }
            }
            System.out.println();
        }
    }
    public void palpite(String chute){
        int coluna = Integer.parseInt(String.valueOf(chute.charAt(0)));
        int linha = Integer.parseInt(String.valueOf(chute.charAt(1)));

        int id = -1, auxiliar = 0;

        if(matriz[linha][coluna] != null){
            if(matriz[linha][coluna].equals("x") || matriz[linha][coluna].equals("-")){
                System.out.println("Chutando cachorro morto meu nobre?");
            }else{
                System.out.println("Achou!!");
                id = Integer.parseInt(matriz[linha][coluna]);
                auxiliar = Integer.parseInt((matriz[linha][coluna]))+1;
                matriz[linha][coluna] = String.valueOf(auxiliar);
                valida_acertados(id);
            }
        }else{
            System.out.println("Errou!!");
            matriz[linha][coluna] = "0";
        }
    }
    public void valida_acertados(int id_acertado){
        boolean verificador = false;
        for (String[] strings : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (strings[j] != null && strings[j].equals(String.valueOf(id_acertado))) {
                    verificador = true;
                    break;
                }
            }
        }
        if(!verificador){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length ; j++) {
                    if(matriz[i][j] != null && matriz[i][j].equals(String.valueOf(id_acertado+1))){
                        matriz[i][j] = "-";
                    }
                }
            }
            qtde_navios--;
            if(qtde_navios != 0){
                System.out.println("Boa, faltam: "+qtde_navios+" navios");
            }
        }
    }
}
