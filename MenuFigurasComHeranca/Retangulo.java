public class Retangulo extends FiguraGeometrica{

    int base = 0, altura = 0;

    @Override
    public float getArea() {
        return base*altura;
    }

    @Override
    public float getPerimetro() {
        return 2*(base+altura);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
