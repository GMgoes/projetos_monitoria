import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ProdutoApp {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        while(opcao != 4){
            System.out.println(" 1. CADASTRAR UM NOVO PRODUTO \n 2. LISTAR TODOS OS PRODUTOS DE UM TIPO \n 3. EXCLUIR UM PRODUTO \n 4. SAIR");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> menu_cadastro();
                case 2 -> menu_listar();
                case 3 -> menu_excluir();
            }
        }
    }
    public static void menu_cadastro(){

        Produto produto = new Produto();
        boolean flag = false;
        System.out.println("Informe o tipo do produto para cadastrar (CALCADOS, PERFUMARIA, VESTUARIO)");
        String tipo_produto = entrada.next().toUpperCase();

        switch(tipo_produto){
            case "PERFUMARIA":
                produto.setTipo_produto(TipoProdutos.PERFUMARIA);
                flag = true;
                break;
            case "VESTUARIO":
                produto.setTipo_produto(TipoProdutos.VESTUARIO);
                flag = true;
                break;
            case "CALCADOS":
                produto.setTipo_produto(TipoProdutos.CALCADOS);
                flag = true;
            default:
                break;
        }
        if(flag){
            System.out.println("Informe o código do produto");
            int codigo = entrada.nextInt();

            System.out.println("Informe a descrição do produto");
            String descricao = entrada.next();

            System.out.println("Informe o valor do produto");
            double valor = entrada.nextDouble();

            produto.setCodigo_produto(codigo);
            produto.setDescricao(descricao);
            produto.setValor(valor);

            ProdutoDB.cadastrar_produto(produto);
            }else{
                System.out.println("Tipo inválido");
        }
    }
    public static void menu_listar(){

        boolean flag = false;
        System.out.println("Qual tipo de produtos você quer listar? (CALCADOS, PERFUMARIA, VESTUARIO)");

        String tipo_produto = entrada.next().toUpperCase();

        switch (tipo_produto) {
            case "CALCADOS" -> {
                ProdutoDB.listar_produtos(TipoProdutos.CALCADOS);
                flag = true;
            }
            case "VESTUARIO" -> {
                ProdutoDB.listar_produtos(TipoProdutos.VESTUARIO);
                flag = true;
            }
            case "PERFUMARIA" -> {
                ProdutoDB.listar_produtos(TipoProdutos.PERFUMARIA);
                flag = true;
            }
            default -> {
            }
        }
        if(!flag){
            System.out.println("Não existe esse tipo de produto");
        }
    }
    public static void menu_excluir(){
        int id;
        System.out.println("Informe o ID do produto que você deseja excluir");
        id = entrada.nextInt();

        ProdutoDB.remover_produto(id);

    }
}