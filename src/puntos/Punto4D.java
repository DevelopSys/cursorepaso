package puntos;

import java.awt.*;

public class Punto4D extends Punto3D {

    // x y los ha otorgado la superclase
    int j;

    public Punto4D(int x, int y, int z,int j){
        super(x,y,z);
        this.j = j;
    }

    protected void mover(int x, int y, int z, int j){
        super.mover(x,y,z);
        this.j = j;
    }
    protected void transladar(int x, int y, int z, int j){
        super.transladar(x,y,z);
        this.j = this.j + j;
    }

    protected void distancia (Punto4D punto){
        int min=0, max=0;
        if (punto.x > this.x){
            max = punto.x;
            min = this.x;
        }
        else {
            max = this.x;
            min = punto.x;
        }

        int distancia = max - min;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
