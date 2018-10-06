package examen;

public class LlamadaNacional extends Llamada{
    //
    String franja;

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, String franja) {
        super(nOrigen, nDestino, duracion);
        setFranja(franja);
        calcularCoste();
    }

    @Override
    public void calcularCoste() {
        if (franja.equals("A")){
            setCoste(0.20 *getDuracion());
        }else if (franja.equals("B")){
            setCoste(0.60 *getDuracion());
        }else if (franja.equals("C")){
            setCoste(0.80 *getDuracion());
        }
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }
}
