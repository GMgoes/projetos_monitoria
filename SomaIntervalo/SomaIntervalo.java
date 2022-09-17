import java.util.Scanner;

public class SomaIntervalo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int soma = 0;
        if(a > b){
            System.out.println("Informe uma entrada válida");
        }else{
            for (int i = a; i <= b; i++){
                soma = soma + a;
            }
            System.out.println(soma);
        }
    }
}
