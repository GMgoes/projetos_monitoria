import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Path newFile = Paths.get("src/solucaotriangulos.txt");
        Path existingFile = Paths.get("src/triangulos.txt");

        try{
            FileWriter myWhiter = new FileWriter(newFile.toFile());
            Scanner myReader = new Scanner(existingFile.toFile());


            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                int[] lados = new int[3];
                int i=0;
                for (String s : data.split(" ")) {
                    lados[i] = Integer.parseInt(s);
                    i++;
                }
                Triangulo triangulo = new Triangulo(lados[0],lados[1],lados[2]);

                if(Triangulo.isTriangulo(triangulo)){
                    myWhiter.write(Triangulo.tipoTriangulo(triangulo) + "\n");
                }else{
                    myWhiter.write("Não é um triângulo\n");
                }
            }
            myWhiter.close();
            System.out.println("Escrita feita com sucesso.");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
