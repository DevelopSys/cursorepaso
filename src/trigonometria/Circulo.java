package trigonometria;

public class Circulo {

    int x,y;
    double radio;

    public Circulo(int x, int y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadio() {
        return radio;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double calcularArea(){

        return Math.PI * Math.sqrt(this.radio);

    }
    private double calcularDiametro(){

        return 2*this.radio;

    }

    private int calcularDistancia(Circulo circulo){

        int max,min;

        if (this.x > circulo.getX()){
            max = this.x;
            min = circulo.getX();
        }
        else {
            max = circulo.getX();
            min = this.x;

        }

        return max - min;

    }
}
