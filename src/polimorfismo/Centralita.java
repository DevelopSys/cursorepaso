package polimorfismo;

public class Centralita {

    Trabajador[] trabajadors = new Trabajador[20];

    public Centralita() {
    }

    public void recorrerTrabajadores(){
        for (Trabajador tTemporal: trabajadors) {
            System.out.println(tTemporal.mostrarDatos());
        }
    }

    public void anadirTrabajador(Trabajador trabajador){
        trabajadors[trabajadors.length] = trabajador;
    }
}
