public class CPFValidator {

    static String cpf;
    public static boolean validate(String cpf) {
        String s2 = limpa(cpf).substring(0, 9) + calculoDigito(10, limpa(cpf).substring(0, 9)) + calculoDigito(11, limpa(cpf));
        if (limpa(cpf).equals(s2)) {
            return true;
        }
        return false;
    }
    public static String limpa(String cpf) {
        String s1 = cpf.replace(".", "").replace("-", "");
        return s1;
    }
    public static int calculoDigito(int peso, String cpf) {

        int soma = 0, resto, quociente, digito;
        char[] vetorNum = cpf.toCharArray();
        int[] vetorInt = new int[cpf.length()];

        for (int i = 0; i < cpf.length(); i++) {
            vetorInt[i] = Integer.parseInt(Character.toString(vetorNum[i]));
        }
        for (int i = 0; i < vetorInt.length; i++) {
            soma = soma + (vetorInt[i] * peso);
            peso--;
        }
        resto = soma % 11;
        quociente = soma / 11;
        digito = 11 - resto;
        if (resto < 2) {
            digito = 0;
            return digito;
        } else {

            return digito;
        }
    }
}
