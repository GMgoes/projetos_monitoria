import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cpf = "007.354.941-00";

        System.out.println(ValidaCPF.validar(cpf));
    }
}
