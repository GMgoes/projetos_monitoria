public class ProdutoDB {

    static Produto [] vetor_produtos = new Produto[100];

    static void cadastrar_produto(Produto produto){
        boolean flag = false, codigo_duplicado = false;
        for (Produto produto_no_array:vetor_produtos) {
            if(produto_no_array != null){
                if(produto.getCodigo_produto() == produto_no_array.getCodigo_produto()){
                    codigo_duplicado = true;
                }
            }
        }
        if(!codigo_duplicado){
            for (int i = 0; i < vetor_produtos.length; i++){
                if(vetor_produtos[i] == null){
                    vetor_produtos[i] = produto;
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Produto de código "+produto.getCodigo_produto()+" cadastrado");
            }else{
                System.out.println("Não há espaço disponível para cadastrá-lo, remova algum produto primeiro");
            }
        }else{
            System.out.println("Insira outro código, o código "+produto.getCodigo_produto()+" já está sendo usado por outro produto");
        }
    }

    static void remover_produto(int id_produto_excluido){
        boolean flag = false;
        for(int i = 0; i < vetor_produtos.length; i++){
            if(vetor_produtos[i] != null){
                if(vetor_produtos[i].getCodigo_produto() == id_produto_excluido){
                    vetor_produtos[i] = null;
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("Produto excluído");
        }else{
            System.out.println("Nenhum produto com esse ID foi encontrado");
        }

    }

    static void listar_produtos(TipoProdutos produto_enum){
        for (Produto produto:vetor_produtos) {
            if(produto != null){
                if(produto.getTipo_produto().equals(produto_enum)){
                    System.out.println("ID: "+produto.getCodigo_produto()+" Informações: "+produto.getDescricao()+" Valor: "+produto.getValor());
                }
            }
        }
    }
}
