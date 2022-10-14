public class Banco {

    private String nome;
    private ContaCorrente[] contaCorrentes;
    public Banco(String nome, int numContacorrentes) {
        this.nome = nome;
        contaCorrentes = new ContaCorrente[numContacorrentes];
    }
    public void adicionarContaCorrente(String nomeCliente, String cpf, Double saldo) throws CPFExistenteException, CPFInvalidoException, LimiteDeContasAtingidoException {
        Cliente novoCliente = new Cliente(nomeCliente, cpf);
        ContaCorrente novaContaCorrente = new ContaCorrente(novoCliente, saldo);

        this.verificarCpfExistente(cpf);

        boolean contaAdicionada = false;
        for (int i = 0; i < contaCorrentes.length; i++) {
            if (contaCorrentes[i] == null) {
                contaCorrentes[i] = novaContaCorrente;
                contaAdicionada = true;
                break;
            }
        }

        if (!contaAdicionada)
            throw new LimiteDeContasAtingidoException("Conta nao adicionada! Sem espaço na memória!");
    }
    private void verificarCpfExistente(String cpf) throws CPFExistenteException {
        for (ContaCorrente contaCorrente: contaCorrentes) {
            if (contaCorrente != null) {
                if (contaCorrente.getCliente().getCpf().equals(cpf)) {
                    throw new CPFExistenteException("CPF já existente!");
                }
            }
        }
    }
    public void sacar(String cpf, Double saldo) throws SaldoNegativoException, SaldoAcimaException,SaldoLimiteException{
        boolean tag = false;
        for (ContaCorrente contaCorrente: contaCorrentes) {
            if (contaCorrente != null) {
                if (contaCorrente.getCliente().getCpf().equals(cpf)) {
                    if(saldo < 0){
                        throw new SaldoNegativoException("Valor à ser sacado é negativo");
                    }else if(saldo > 5000){
                        throw new SaldoLimiteException("Valor é além do permitido para transações de saque ( R$ 5.000,00)");
                    }else if(saldo > contaCorrente.getSaldo()){
                        throw new SaldoAcimaException("Saldo Insuficiente");
                    }else{
                        contaCorrente.setSaldo(contaCorrente.getSaldo()-saldo);
                        tag = true;
                        System.out.println(contaCorrente.getCliente().getNome()+" agora possuí um saldo de: "+contaCorrente.getSaldo());
                    }
                }
            }
        }
        if(tag) {
            System.out.println("Saque realizado");
        }else{
            System.out.println("Não existe uma conta vinculada à esse CPF");
        }
    }

    public void depositar(String cpf, Double saldo) throws SaldoNegativoException{
        boolean tag = false;
        for (ContaCorrente contaCorrente: contaCorrentes) {
            if (contaCorrente != null) {
                if (contaCorrente.getCliente().getCpf().equals(cpf)) {
                    if(saldo < 0){
                        throw new SaldoNegativoException("Valor à ser sacado é negativo");
                    }else{
                        contaCorrente.setSaldo(contaCorrente.getSaldo()+saldo);
                        tag = true;
                        System.out.println(contaCorrente.getCliente().getNome()+" agora possuí um saldo de: "+contaCorrente.getSaldo());
                    }
                }
            }
        }
        if(tag) {
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Não existe uma conta vinculada à esse CPF");
        }
    }
    public void excluir_conta(String cpf){
        boolean tag = false;
        for (ContaCorrente contaCorrente: contaCorrentes) {
            if (contaCorrente != null) {
                if (contaCorrente.getCliente().getCpf().equals(cpf)) {
                    contaCorrente = null;
                    tag = true;
                    break;
                }
            }
        }
        if(tag) {
            System.out.println("Conta foi excluída");
        }else{
            System.out.println("Não existe uma conta vinculada à esse CPF");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente[] getContaCorrentes() {
        return contaCorrentes;
    }

    public void setContaCorrentes(ContaCorrente[] contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }


}
