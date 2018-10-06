package examen;

public class LlamadaLocal extends Llamada{


    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
        calcularCoste();
    }

    @Override
    public void calcularCoste() {
        setCoste(0.0);

    }


}
