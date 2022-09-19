import java.util.Arrays;

public class MatrixOperations {

    static int[][] add(int [][] matrizA,int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA[0].length];
        if(validaMatriz(matrizA,matrizB)){
            for (int i = 0; i < matrizA.length; ++i) {
                for(int j = 0; j < matrizA[i].length; ++j) {
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            return matrizC;
        }else{
            return null;
        }
    }

    static int[][] sub(int [][] matrizA,int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA[0].length];
        if(validaMatriz(matrizA,matrizB)){
            for (int i = 0; i < matrizA.length; ++i) {
                for(int j = 0; j < matrizA[i].length; ++j) {
                    matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
            return matrizC;
        }else{
            return null;
        }
    }

    static void printAdd(int [][] matrizA,int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA[0].length];
        if(validaMatriz(matrizA,matrizB)){
            for (int i = 0; i < matrizA.length; ++i) {
                for(int j = 0; j < matrizA[i].length; ++j) {
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            for (int [] linha: matrizC) {
                System.out.println(Arrays.toString(linha));
            }
        }else{
            System.out.println("Matrizes não são de mesma ordem");
        }
    }

    static void printSub(int [][] matrizA,int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA[0].length];
        if(validaMatriz(matrizA,matrizB)){
            for (int i = 0; i < matrizA.length; ++i) {
                for(int j = 0; j < matrizA[i].length; ++j) {
                    matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
            for (int [] linha: matrizC) {
                System.out.println(Arrays.toString(linha));
            }
        }else{
            System.out.println("Matrizes não são de mesma ordem");
        }
    }
    public static boolean validaMatriz(int [][] matrizA, int [][] matrizB){
        if(matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length){
            return true;
        }else{
            return false;
        }
    }
}