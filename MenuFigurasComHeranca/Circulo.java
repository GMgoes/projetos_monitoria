public class Circulo extends FiguraGeometrica{

    int raio = 0;
    float pi = 3.1415f;

    @Override
    public float getArea() {
        return pi*(raio*raio);
    }

    @Override
    public float getPerimetro() {
        return 2*pi*raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
}
