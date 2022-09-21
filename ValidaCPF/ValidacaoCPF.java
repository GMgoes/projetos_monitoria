public class ValidacaoCPF {

    public int [] formatar_cpf(String cpf_sem_formatacao){

        String cpf_formatado = cpf_sem_formatacao.replace('-',' ');
        cpf_formatado = cpf_formatado.replace('.',' ');
        cpf_formatado = cpf_formatado.replaceAll("\\s+","");

        int [] vetor_numeros_cpf = new int[cpf_formatado.length()];
        for(int i = 0; i < cpf_formatado.length(); i++){
            vetor_numeros_cpf[i] = Integer.parseInt(String.valueOf(cpf_formatado.charAt(i)));
        }
        return vetor_numeros_cpf;
    }

    public boolean calculador_cpf_primeiro_digito(int [] vetor_cpf) {
        int tamanho = vetor_cpf.length - 2, auxiliar = 10, soma = 0, primeiro_digito = 0;
        for (int i = 0; i < tamanho; i++) {
            soma = soma + (vetor_cpf[i] * auxiliar);
            auxiliar--;
        }
        primeiro_digito = (soma % 11);
        if (primeiro_digito < 2) {
            primeiro_digito = 0;
        } else {
            primeiro_digito = 11 - primeiro_digito;
        }
        if(vetor_cpf[9] == primeiro_digito){
            return true;
        }else{
            return false;
        }
    }

    public void calculador_cpf(int [] vetor_cpf) {
        if(calculador_cpf_primeiro_digito(vetor_cpf)){
            int tamanho = vetor_cpf.length-1, auxiliar = 11, soma = 0, segundo_digito = 0;

            for (int i = 0; i < tamanho; i++) {
                soma = soma + (vetor_cpf[i] * auxiliar);
                auxiliar--;
            }
            segundo_digito = (soma % 11);
            if (segundo_digito < 2) {
                segundo_digito = 0;
            } else {
                segundo_digito = 11 - segundo_digito;
            }
            if(vetor_cpf[10] == segundo_digito){
                System.out.println("CPF é valido");
            }else{
                System.out.println("CPF inválido");
            }
        }else{
            System.out.println("CPF não é valido");
        }
    }
}
