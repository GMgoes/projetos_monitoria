public class Main {

    public static void main(String[] args) {

        var pessoa = new PessoaFisica();
        var pessoaJuridica = new PessoaJuridica();
        var pessoaFisica = new PessoaFisica();

        if(pessoaFisica instanceof Pessoa){
            System.out.println("Pessoa Física é uma instância de pessoa");
        }
        if(pessoaJuridica instanceof Pessoa){
            System.out.println("Pessoa Juridica é uma instância de pessoa");
        }
    }
}
