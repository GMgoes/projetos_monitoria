public class ContaCorrente {

    private Cliente cliente;
    private Double saldo;
    public ContaCorrente(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
