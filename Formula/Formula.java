import java.util.Scanner;

public class Formula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        int e = entrada.nextInt();
        int f = entrada.nextInt();

        double x = ((c*d)-(b*f))/((a*e)-(d*f));
        double y = ((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("Valor de x: "+x);
        System.out.println("Valor de y: "+y);
    }
}
