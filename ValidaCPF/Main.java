import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um CPF");
        String cpf = entrada.next();

        ValidacaoCPF validacao = new ValidacaoCPF();

        //System.out.println(Arrays.toString(validacao.formatar_cpf(cpf)));
        validacao.calculador_cpf(validacao.formatar_cpf(cpf));
    }
}
