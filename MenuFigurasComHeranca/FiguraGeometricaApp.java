import java.util.Scanner;

public class FiguraGeometricaApp {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        FiguraGeometrica [] vetor_objetos = new FiguraGeometrica[10];
        int posicao = 0;
        int opcao = 0;

        while (opcao != 6){
            System.out.println("Informe uma opção");
            opcao = entrada.nextInt();
            posicao = menu(opcao,vetor_objetos,posicao);
        }
        System.out.println("Fim!!!");
    }

    public static int menu(int opcao,FiguraGeometrica[] vetor, int posicao){
        switch (opcao) {
            case 1 -> {
                if(posicao < 10) {
                    System.out.println("Adicionar triângulo");
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Informe o primeiro lado");
                    triangulo.setLado1(entrada.nextInt());
                    System.out.println("Informe o segundo lado");
                    triangulo.setLado2(entrada.nextInt());
                    System.out.println("Informe o terceiro lado");
                    triangulo.setLado3(entrada.nextInt());
                    System.out.println("Informe qual é a base");
                    triangulo.setBase(entrada.nextInt());
                    System.out.println("Informe qual é a altura");
                    triangulo.setAltura(entrada.nextInt());
                    vetor[posicao] = triangulo;
                    posicao++;
                }else{
                    System.out.println("Vetor já está cheio");
                }
            }
            case 2 ->{
                if(posicao < 10) {
                    System.out.println("Adicionar Quadrado");
                    Quadrado quadrado = new Quadrado();
                    System.out.println("Informe o valor dos lados do quadrado");
                    quadrado.setLado(entrada.nextInt());
                    vetor[posicao] = quadrado;
                    posicao++;
                }else{
                    System.out.println("Vetor já está cheio");
                }
            }
            case 3 ->{
                if(posicao < 10) {
                    System.out.println("Adicionar Retangulo");
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Informe o valor da base");
                    retangulo.setBase(entrada.nextInt());
                    System.out.println("Informe o valor da altura");
                    retangulo.setAltura(entrada.nextInt());
                    vetor[posicao] = retangulo;
                    posicao++;
                }else{
                    System.out.println("Vetor já está cheio");
                }
            }
            case 4 ->{
                if(posicao < 10) {
                    System.out.println("Adicionar Circulo");
                    Circulo circulo = new Circulo();
                    System.out.println("Informe o valor do raio");
                    circulo.setRaio(entrada.nextInt());
                    vetor[posicao] = circulo;
                    posicao++;
                }else{
                    System.out.println("Vetor já está cheio");
                }
            }
            case 5 ->{
                for (FiguraGeometrica elemento : vetor) {
                    if(elemento != null){
                        System.out.println("Objeto: "+elemento+" Área: "+elemento.getArea()+" Perímetro: "+elemento.getPerimetro());
                    }
                }
            }
        }
        return posicao;
    }
}
