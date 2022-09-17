public class Circulo {

    private int raio;
    private double area;

    public double areaCirculo(Circulo circulo){
        area = (Math.PI*(Math.pow(circulo.raio,2)));
        return area;
    }
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

