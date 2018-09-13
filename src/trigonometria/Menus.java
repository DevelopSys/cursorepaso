package trigonometria;

public class Menus {

    private String menuGenerico(){

        String menu = "*** Calculadora trigonometrica *** \n" +
                "1.- Operaciones con circulos\n" +
                "2.- Operaciones con rectángulos\n" +
                "3.- Operaciones con triágunlos\n" +
                "4.- Salir\n";

        return menu;
    }
    private String menuCirculo(){

        String menuCirculo = "*** Calculadora circulos *** \n" +
                "1.- Calcular área\n" +
                "2.- Calcular perímetro\n" +
                "3.- Calcular distancia\n" +
                "4.- Atras\n";

        return menuCirculo;
    }

}
