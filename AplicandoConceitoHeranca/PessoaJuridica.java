public class PessoaJuridica extends Pessoa{

    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cnpj) {
        this.cpnj = cnpj;
    }

    public void falar_pessoa_juridica(){
        System.out.println("Olá, sou uma pessoa Juridica, e meu número de identificação é: "+cpnj);
    }
}
