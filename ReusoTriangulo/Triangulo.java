public class Triangulo {
    private int AB, BC, CA;
    private String nome;
    public boolean isTriangulo(int a, int b, int c){
        if(a + b > c || a + c > b || c + b > a){
            return true;
        }else{
            return false;
        }
    }
    public void tipoTriangulo(Triangulo triangulo){
        if(isTriangulo(triangulo.getAB(), triangulo.getBC(), triangulo.getCA())){
            if(triangulo.getAB() == triangulo.getBC() && triangulo.getBC() == triangulo.getCA()){
                System.out.print("Triângulo Equilátero");
            }else if(triangulo.getAB() == triangulo.getBC() || triangulo.getBC() == triangulo.getCA() || triangulo.getCA() == triangulo.getAB()){
                System.out.print("Triângulo Isosceles");
            }else{
                System.out.print("Triângulo Escaleno");
            }
        }else{
            System.out.println("Não é um triângulo, impossível definir o tipo");
        }
    }

    public int getAB() {
        return AB;
    }

    public void setAB(int AB) {
        this.AB = AB;
    }

    public int getBC() {
        return BC;
    }

    public void setBC(int BC) {
        this.BC = BC;
    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        this.CA = CA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Triangulo[" +
                "AB=" + AB +
                ", BC=" + BC +
                ", CA=" + CA +
                ", nome='" + nome + '\'' +
                ']';
    }
}
