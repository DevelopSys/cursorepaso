package colecciones.temperaturas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc = null;
        int opcion = 0;
        Menus m = new Menus();
        Operaciones op = new Operaciones();
        do {
            sc = new Scanner(System.in);
            System.out.println(m.menuGenerico());
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce temperatura");
                    try{
                        Double temperatura = sc.nextDouble();
                        op.anadirTemperatura(temperatura);

                    } catch (InputMismatchException exception){
                        System.out.println("Dato introducido incorrecto");
                        System.out.println("Saliendo");
                    }
                    break;
                case 2:
                    op.mostrarTemperaturas();
                    break;
                case 3:
                    op.vaciarLista();
                    break;
                case 4:
                    Double[] ext = op.sacarExtremos();
                    System.out.println("El minimo es: "+ ext[0]);
                    System.out.println("El máximo es: "+ ext[1]);

                    break;
                case 5:
                    System.out.println("La media resultante es: " + op.sacarMedia());
                    break;
                default:
                    if (opcion!=6){
                        System.out.println("Opción no contemplada");
                    }
                    break;
            }

        } while (opcion != 6);

    }
}
