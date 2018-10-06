package examen;

import java.io.Serializable;

public abstract class Llamada implements Serializable {

    //
    int nOrigen, nDestino, duracion;
    double coste;

    public Llamada(int nOrigen, int nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String patron = "Numero origen: %d Numero destino: %d Duracion: %d Coste: %f";
        return String.format(patron,getnOrigen(),getnDestino(),getDuracion(),getCoste());
    }

    public abstract void calcularCoste();

    public int getnOrigen() {
        return nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
