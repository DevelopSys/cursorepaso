package examen;

public class Menu {

    protected String menuGenerico() {

        String menu = "*** Centralita de llamadas *** \n" +
                "1.- Registrar llamadas\n" +
                "2.- Listar llamadas\n" +
                "3.- Mostrar costes\n" +
                "4.- Exportar datos\n" +
                "5.- Importar datos\n" +
                "0.- Salir\n" +
                "Introduce una opción: ";
        return menu;
    }

    protected String menuRegistrarLlamadas() {

        String menuCr = "*** Tipo de llamada quieres registrar *** \n" +
                "1.- Local\n" +
                "2.- Nacional\n" +
                "3.- Internacional\n" +
                "Introduce una opción: ";

        return menuCr;
    }
    protected String menuInfoLlamadas() {

        String menuCr = "*** Tipo de llamada quieres listar *** \n" +
                "1.- Local\n" +
                "2.- Nacional\n" +
                "3.- Internacional\n" +
                "4.- Todas\n" +
                "Introduce una opción: ";

        return menuCr;
    }



}
