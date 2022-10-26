public class CalcularFatorial {
    public static void main(String[] args) {
    //Algoritmos Recursivos

        //imprimirNumeros(0,5);
        //System.out.println("O resultado da soma entre dois números é: "+somarNumeros(1,5));
        System.out.println("O resultado do fatorial do número 5 é: "+calcularFatorial(5));
    }
    static void imprimirNumeros(int n, int m){
        if(n < m){
            //Ele imprime para o usuário o valor de n no momento
            System.out.println(n);
            //Passo recursivo, ele entra novamente numa função imprimirNumeros()
            imprimirNumeros(n+1,m);
        }
    }
    static int somarNumeros(int n, int m){
        if(n == m){
            System.out.println(m);
            return n;
        }else{
            System.out.println(n);
            return n + somarNumeros(n+1,m);
        }
    }
    static int calcularFatorial(int n){
        if(n == 1){
            return n;
        }else{
            return n * calcularFatorial(n-1);
        }
    }

}
