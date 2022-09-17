import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        for(int i = 1; i <= numero; i++ ){
            for (int j = 1; j <= numero; j++){
                if(i == j){
                    System.out.print(" "+j+" ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
