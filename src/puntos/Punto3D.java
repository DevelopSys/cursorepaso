package puntos;

import java.awt.*;
import java.util.Scanner;

public class Punto3D extends Point {

    // x y los ha otorgado la superclase
    int z;

    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public Punto3D(){

    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public void translate(int dx, int dy, int dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    protected void distancia (Punto3D punto){
        int min=0, max=0;
        if (punto.x > this.x){
            max = punto.x;
            min = this.x;
        }
        else {
            max = this.x;
            min = punto.x;
        }

        int distancia = max -min;
    }

    public int getZ() {
        return z;
    }

    protected  void crearPunto(){
        System.out.println("Introduce la coordenada x");
        x = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada y");
        y = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada z");
        z = new Scanner(System.in).nextInt();
    }


    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", z=" + z;
    }
}
