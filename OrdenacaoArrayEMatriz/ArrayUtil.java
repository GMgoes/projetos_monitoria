public class ArrayUtil {

    public static boolean localizarNumero(int[] vetor,int valor_buscado){
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] != valor_buscado){
                continue;
            }else{
                return true;
            }
        }
        return false;
    }

    public static boolean localizarNumeroMatriz(int[][] matriz,int valor_buscado){
        for (int j = 0; j < matriz.length; j++){
            for(int i = 0; i < matriz.length;i++){
                if(matriz[j][i] != valor_buscado){
                    continue;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void ordenarCrescente(int [] vetor){
        int aux = -1;
        for(int i = 0; i < vetor.length;i++){
            for(int j = i; j < 5;j++){
                if(vetor[i] > vetor[j]){
                 aux = vetor[i];
                 vetor[i] = vetor[j];
                 vetor[j] = aux;
                }
            }
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    public static void ordenarDecrescente(int [] vetor){
        int aux = -1;
        for(int i = 0; i < vetor.length;i++){
            for(int j = i; j < 5;j++){
                if(vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    public static void ordenarSelecionado(int [] vetor,int opcao){
        if(opcao == 1){
            ordenarDecrescente(vetor);
        }else if(opcao == 2){
            ordenarCrescente(vetor);
        }
    }

    //Imprimir é bem intuitivo, então pulei.
}
