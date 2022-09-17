public class CalculaPi {

    public static void main(String[] args) {

        double divisor = 3, numero_pi = 4, auxiliar = 0;
        while(numero_pi != Math.PI){
            if(auxiliar % 2 == 0){
                numero_pi = numero_pi -(4/divisor);
            }else{
                numero_pi = numero_pi +(4/divisor);
            }
            divisor = divisor + 2;
            auxiliar++;
            System.out.println(numero_pi);
        }
        System.out.println(numero_pi);
    }
}
