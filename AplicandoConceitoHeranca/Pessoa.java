public class Pessoa {

    private String nome;
    private int idade;
    private String numero_identificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumero_identificacao() {
        return numero_identificacao;
    }

    public void setNumero_identificacao(String numero_identificacao) {
        this.numero_identificacao = numero_identificacao;
    }

    public void falar_pessoa(){
        System.out.println("Olá, sou uma pessoa e meu número de identificação é: "+numero_identificacao);
    }
}
