public class Triangulo extends FiguraGeometrica {

    int lado1 = 0, lado2 = 0, lado3 = 0, base = 0, altura = 0;

    @Override
    public float getArea() {
        return (base*altura)/2;
    }
    @Override
    public float getPerimetro() {
        return (lado1+lado2+lado3);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
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
