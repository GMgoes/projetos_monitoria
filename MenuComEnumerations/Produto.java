public class Produto {

    private int codigo_produto;
    private String descricao;
    private double valor;
    TipoProdutos tipo_produto;

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoProdutos getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(TipoProdutos tipo_produto) {
        this.tipo_produto = tipo_produto;
    }
}
