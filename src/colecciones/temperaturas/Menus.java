package colecciones.temperaturas;

public class Menus {

    protected String menuGenerico() {

        String menu = "*** Gestión de temperaturas *** \n" +
                "1.- Añadir temperatura\n" +
                "2.- Mostrar temperaturas\n" +
                "3.- Vaciar temperaturas\n" +
                "4.- Sacar extremos\n" +
                "5.- Sacar media\n" +
                "6.- Salir\n" +
                "Introduce una opción: ";
        return menu;
    }
}
