import java.util.Scanner;

public class BancoApp {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        Banco bradesco = new Banco("Bradesco", 10);

        int opcao = 0;

        while(opcao != 3){
            System.out.println("Informe uma opção \n 1 - Cadastro de uma nova conta \n 2 - Exclusão de uma conta \n 3 - Ir para as operações");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> { opcao_inserir_conta(bradesco); }
                case 2 -> { opcao_excluir_conta(bradesco); }
            }

        }

        opcao = 0;

        while(opcao != 3){
            System.out.println("Informe uma opção \n 1 - Saque \n 2 - Deposito \n 3 - Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> { opcao_realizar_saque(bradesco); }
                case 2 -> { opcao_realizar_deposito(bradesco); }
            }
        }
    }
    public static void opcao_inserir_conta(Banco bradesco){
        System.out.println("Informe o nome do cliente que deseja cadastrar, o CPF e o saldo do mesmo");
        try {
            bradesco.adicionarContaCorrente(entrada.next(), entrada.next(), entrada.nextDouble());
            System.out.println("Conta adicionada!!");
        } catch (CPFInvalidoException | CPFExistenteException | LimiteDeContasAtingidoException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void opcao_excluir_conta(Banco bradesco){
        System.out.println("Informe o CPF do cliente que deseja excluir");
        bradesco.excluir_conta(entrada.next());
    }
    public static void opcao_realizar_saque(Banco bradesco){
        System.out.println("Informe o CPF do cliente e o valor que deseja sacar");
        try{
            bradesco.sacar(entrada.next(),entrada.nextDouble());
        }catch(SaldoNegativoException | SaldoLimiteException| SaldoAcimaException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void opcao_realizar_deposito(Banco bradesco){
        System.out.println("Informe o CPF do cliente e o valor que deseja depositar");
        try{
            bradesco.depositar(entrada.next(),entrada.nextDouble());
        }catch(SaldoNegativoException exception){
            System.out.println(exception.getMessage());
        }
    }
}
