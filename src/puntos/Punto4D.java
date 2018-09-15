package puntos;

import java.awt.*;
import java.util.Scanner;

public class Punto4D extends Punto3D {

    // x y los ha otorgado la superclase
    int j;

    public Punto4D(int x, int y, int z, int j) {
        super(x, y, z);
        this.j = j;
    }

    public Punto4D() {

    }

    public void move(int x, int y, int z, int j) {
        super.move(x, y, z);
        this.j = j;
    }

    public void translate(int dx, int dy, int dz, int dj) {
        super.translate(dx, dy, dz);
        this.j += dj;
    }

    protected void distancia(Punto4D punto) {
        int min = 0, max = 0;
        if (punto.x > this.x) {
            max = punto.x;
            min = this.x;
        } else {
            max = this.x;
            min = punto.x;
        }

        int distancia = max - min;
    }

    public int getJ() {
        return j;
    }

    protected void crearPunto() {
        System.out.println("Introduce la coordenada x");
        x = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada y");
        y = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada z");
        z = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada j");
        j = new Scanner(System.in).nextInt();

    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", j=" + j;
    }
}
