package trigonometria;

public class Rectangulo {

    int altura, anchura;

    public Rectangulo(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    private int calcularArea() {
        return this.altura * this.anchura;
    }
    private int calcularPerimetro() {
        return (2*this.altura) + (2 * this.anchura);
    }
}
