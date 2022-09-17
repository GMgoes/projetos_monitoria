import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        Scanner entrada = new Scanner(System.in);

        triangulo.setAB(entrada.nextInt());
        triangulo.setBC(entrada.nextInt());
        triangulo.setCA(entrada.nextInt());

        triangulo.tipoTriangulo(triangulo);

        triangulo2.setAB(entrada.nextInt());
        triangulo2.setBC(entrada.nextInt());
        triangulo2.setCA(entrada.nextInt());

        triangulo2.tipoTriangulo(triangulo2);
    }
}
