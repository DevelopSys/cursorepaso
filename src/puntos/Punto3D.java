package puntos;

import java.awt.*;

public class Punto3D extends Point {

    // x y los ha otorgado la superclase
    int z;

    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    protected void mover(int x, int y, int z){
        super.move(x,y);
        this.z = z;
    }
    protected void transladar(int x, int y, int z){
        super.translate(x,y);
        this.z = this.z + z;
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

    @Override
    public String toString() {
        return "Punto3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
