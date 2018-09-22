package polimorfismo;

public class Entrada {

    public static void main(String[] args) {
        Centralita c = new Centralita();
        Trabajador t = new Asalariado("", "", "", 12, 20000);
        Trabajador tDos = new Autonomo("", "", "", 20, 20000);
        c.anadirTrabajador(t);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.anadirTrabajador(tDos);
        c.recorrerTrabajadores();
    }
}
