public class PessoaFisica extends Pessoa{

    private  String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void falar_pessoa_fisica(){
        System.out.println("Olá, sou uma pessoa Fisica, e meu número de identificação é: "+cpf);
    }
}
