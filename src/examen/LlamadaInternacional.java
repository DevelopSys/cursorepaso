package examen;

public class LlamadaInternacional extends Llamada {

    String continente;

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getContinente() {
        return continente;
    }

    public LlamadaInternacional(int nOrigen, int nDestino, int duracion, String continente) {
        super(nOrigen, nDestino, duracion);
        setContinente(continente);
        calcularCoste();

    }

    @Override
    public void calcularCoste() {
        if (continente.equals("america")){
            setCoste(0.20 *getDuracion());
        }else if (continente.equals("europa")){
            setCoste(0.60 *getDuracion());
        }else if (continente.equals("africa")){
            setCoste(0.80 *getDuracion());
        }
    }
}
