public class Triangulo {

    private int AB, BC, CA;

    public Triangulo(int AB, int BC, int CA) {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }

    public static boolean isTriangulo(Triangulo triangulo){
        return triangulo.getAB() + triangulo.getBC() > triangulo.getCA() || triangulo.getAB() + triangulo.getCA() > triangulo.getBC() || triangulo.getCA() + triangulo.getBC() > triangulo.getAB();
    }
    public static String tipoTriangulo(Triangulo triangulo){
        if(isTriangulo(triangulo)){
            if(triangulo.getAB() == triangulo.getBC() && triangulo.getBC() == triangulo.getCA()){
                return "Triângulo Equilátero";
            }else if(triangulo.getAB() == triangulo.getBC() || triangulo.getBC() == triangulo.getCA() || triangulo.getCA() == triangulo.getAB()){
                return "Triângulo Isosceles";
            }else{
                return "Triângulo Escaleno";
            }
        }else{
            return "Não é um triângulo";
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
}