import java.util.Scanner;

public class ReusoTriangulo {

    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();

        Triangulo [] vetorTriangulos = new Triangulo[quantidade];

        for(int i = 0; i < quantidade; i++){
            Triangulo triangulo = new Triangulo();
            String nome = "Triangulo ";
            nome = nome +i;
            triangulo.setNome(nome);
            triangulo.setAB(entrada.nextInt());
            triangulo.setBC(entrada.nextInt());
            triangulo.setCA(entrada.nextInt());

            vetorTriangulos[i] = triangulo;
        }
        for (int i = 0; i < quantidade; i++){
            System.out.print(vetorTriangulos[i]);
            vetorTriangulos[i].tipoTriangulo(vetorTriangulos[i]);
            System.out.println();
        }

    }
}
