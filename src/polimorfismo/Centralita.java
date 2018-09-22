package polimorfismo;

public class Centralita {

    Trabajador[] trabajadors = new Trabajador[20];
    int asalariados = 0;
    int autonomos = 0;
    int nTrabajadores = 0;

    public Centralita() {
    }

    public void recorrerTrabajadores() {
        try {
            for (Trabajador tTemporal : trabajadors) {
                System.out.println(tTemporal.mostrarDatos());
            }
        }catch (NullPointerException e){
            System.out.println("Recorrida");
        }
    }

    public void anadirTrabajador(Trabajador trabajador) {

        if (trabajador.getClass().getName().equals(Asalariado.class.getName())) {
            if (asalariados >= 10) {
                System.out.println("No se pueden agregar trabajadores");
            } else {
                trabajadors[nTrabajadores] = trabajador;
                asalariados++;
                nTrabajadores++;
                System.out.println("Añadido correctamente");

            }
        } else {
            if (autonomos >= 10) {
                System.out.println("No se pueden agregar trabajadores");
            } else {
                trabajadors[nTrabajadores] = trabajador;
                autonomos++;
                nTrabajadores++;
                System.out.println("Añadido correctamente");
            }
        }
    }
}
