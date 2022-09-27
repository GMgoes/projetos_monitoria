public class Quadrado extends FiguraGeometrica{

    int lado = 0;
    @Override
    public float getArea() {
        return lado*lado;
    }

    @Override
    public float getPerimetro() {
        return (4*lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


}
