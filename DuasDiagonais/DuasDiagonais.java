import java.util.Scanner;

public class DuasDiagonais {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if(numero %2 != 0){
            System.out.println("Entrada inválida");
        }else{
            int auxiliar = numero;
            for(int i = 1; i <= numero; i++ ){
                for (int j = 1; j <= numero; j++){
                    if(i == j || j == auxiliar){
                        System.out.print(" "+j+" ");
                    }else{
                        System.out.print(" - ");
                    }
                }
                auxiliar--;
                System.out.println();
            }
        }
    }
}
