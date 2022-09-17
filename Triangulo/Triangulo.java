import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int AB = entrada.nextInt();
        int BC = entrada.nextInt();
        int CA = entrada.nextInt();

        if(AB + BC > CA || AB + CA > BC || CA + BC > AB){
            System.out.print("É um triângulo. ");
            if(AB == BC && BC == CA){
                System.out.print("Triângulo Equilátero");
            }else if(AB == BC || BC == CA || CA == AB){
                System.out.print("Triângulo Isosceles");
            }else{
                System.out.print("Triângulo Escaleno");
            }
        }else{
            System.out.println("Não é um triângulo");
        }

    }
}
