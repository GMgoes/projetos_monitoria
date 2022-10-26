import java.util.Scanner;

public class NumeroOcorrencia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numero = ler.next();
        System.out.print("Digite o valor do número para recorrência : ");
        String recorrente = ler.next();

        System.out.println("O número aparece: " + ocorrenciasNatural(numero, recorrente, 0, 0)+" vezes");
    }

    static int ocorrenciasNatural(String numero, String recorrente, int i, int soma) {
         if(numero.charAt(i) == recorrente.charAt(0)){
             soma++;
        }
        if(i == numero.length()-1){
             return soma;
        }else{
            return ocorrenciasNatural(numero, recorrente, i+1,soma);
        }
    }
}
