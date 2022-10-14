import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static double acertos = 0, qteLinhas = 0;

    public static void main(String[] args) {
        Path prova = Paths.get("src/prova.txt");
        Path gabarito = Paths.get("src/gabarito.txt");
        Path resultado = Paths.get("src/resultado.txt");

        try{
            Scanner prova_ler = new Scanner(prova.toFile());
            Scanner gabarito_ler = new Scanner(gabarito.toFile());
            FileWriter escritor = new FileWriter(resultado.toFile());

            while(prova_ler.hasNextLine()){
                qteLinhas++;
                if(prova_ler.nextLine().equals(gabarito_ler.nextLine())){
                    acertos++;
                    escritor.write("1\n");
                }else{
                    escritor.write("0\n");
                }
            }
            double porcentagem = ((acertos/ qteLinhas)*100);
            escritor.write(porcentagem+ "% de Acertos");
            escritor.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
