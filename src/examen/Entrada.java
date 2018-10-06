package examen;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Centralita c = new Centralita();
        Menu m = new Menu();
        int opcion = 0, opcionPropia = 0;
        String opcionFranja;
        Llamada llamada;
        int nOrigen, nDestino, duracion;
        String franja, pais;
        do {
            llamada = null;
            System.out.println(m.menuGenerico());
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Que tipo de llamada quieres introducir");
                    System.out.println(m.menuRegistrarLlamadas());
                    opcionPropia = new Scanner(System.in).nextInt();
                    switch (opcionPropia) {
                        case 1:
                            System.out.printf("Introduce número origen");
                            nOrigen = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce número destino");
                            nDestino = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce duracion");
                            duracion = new Scanner(System.in).nextInt();
                            llamada = new LlamadaLocal(nOrigen, nDestino, duracion);
                            break;
                        case 2:
                            System.out.printf("Introduce número origen");
                            nOrigen = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce número destino");
                            nDestino = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce duracion");
                            duracion = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce franja (A|B|C)");
                            franja = new Scanner(System.in).next();
                            llamada = new LlamadaNacional(nOrigen, nDestino, duracion, franja);
                            break;
                        case 3:
                            System.out.printf("Introduce número origen");
                            nOrigen = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce número destino");
                            nDestino = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce duracion");
                            duracion = new Scanner(System.in).nextInt();
                            System.out.printf("Introduce pais (america|europa|africa)");
                            pais = new Scanner(System.in).next();
                            llamada = new LlamadaInternacional(nOrigen, nDestino, duracion, pais);
                            break;
                        default:
                            break;
                    }
                    c.registrarLlamada(llamada);
                    break;
                case 2:
                    Class tipo = null;
                    System.out.println(m.menuInfoLlamadas());
                    opcionPropia = new Scanner(System.in).nextInt();
                    switch (opcionPropia) {
                        case 1:
                            tipo = LlamadaLocal.class;
                            break;
                        case 2:
                            tipo = LlamadaNacional.class;
                            break;
                        case 3:
                            tipo = LlamadaInternacional.class;
                            break;
                        case 4:
                            tipo = Llamada.class;
                            break;
                        default:
                            break;
                    }
                    c.informacion(tipo);
                    break;
                case 3:
                    System.out.println(String.format("El coste todal acumulado es: %f: ", c.costeTotal()));
                    break;
                case 4:
                    c.exportarDatos();
                    break;
                case 5:
                    c.importarDatos();
                    break;
                default:
                    if (opcion != 0) {
                        System.out.println("El dato introducido no es correcto");
                    }
                    break;
            }

        } while (opcion != 0);

    }
}
