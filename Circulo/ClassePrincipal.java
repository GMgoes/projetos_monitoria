import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Circulo circulo = new Circulo();

        circulo.setRaio(entrada.nextInt());
        System.out.println(circulo.areaCirculo(circulo));
    }
}
